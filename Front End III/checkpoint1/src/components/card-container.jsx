import { Component } from "react";
import Card from './card.jsx'
import '../styles/card-container.scss'
import axios from "axios";

export default class CardContainer extends Component{

  constructor(){
    super();
    this.state={
      projects:[]
    }
  }

  componentDidMount(){
    let data;
    axios('http://localhost:8080/portfolio')
    .then(json=>{
      data=json.data;
      this.setState({
        projects:data
      })
    })
    .catch(error=>{
      console.log(error);
    });
    
  }

  render(){
    return(
      <div id="projects" className="card-container">
        {this.state.projects.map(e=>{
          return(
            <Card key={e.id} name={e.name} description={e.description} link={e.link} code={e.code}/>
          )
        })}
      </div>
    )
  }
}