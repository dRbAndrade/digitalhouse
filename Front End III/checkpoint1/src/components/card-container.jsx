import { Component } from "react";
import Card from './card.jsx'
import '../styles/card-container.scss'

export default class CardContainer extends Component{

  constructor(){
    super();
    this.state={
      projects:[]
    }
  }

  componentDidMount(){
    let data;
    fetch('../projects.json')
      .then(res=>{
        return res.json()
      })
      .then(json=>{
        data=json;
        this.setState({
          projects:data
        })
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