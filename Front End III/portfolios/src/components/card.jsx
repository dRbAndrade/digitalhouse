import { Component } from "react";
import '../styles/card.scss'
import '../fonts/style.css'
export default class Card extends Component{

  render(){
    const title = this.props.name[0].toUpperCase()+this.props.name.substring(1);
    return(
      <a className="card" href={this.props.link} target="_blank" rel='noreferrer'>
        <div>
          <img src={`./assets/${this.props.name.replace(" ","-")}.png`} alt="Site"/>
          <h2>{title}</h2>
          <p>{this.props.description}</p>
        </div>
        <a href={this.props.code}target="_blank" rel='noreferrer'><i className="icon-github"/>Code on GitHub</a>
      </a>
    )
  }

}