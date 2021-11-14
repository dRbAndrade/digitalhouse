import { Component } from "react";
import '../styles/card.scss'
export default class Card extends Component{

  render(){
    const title = this.props.name[0].toUpperCase()+this.props.name.substring(1);
    return(
      <a className="card" href={this.props.link} target="_blank" rel='noreferrer'>
        <img src={`./assets/${this.props.name}.png`} alt="Site"/>
        <h2>{title}</h2>
        <p>{this.props.description}</p>
      </a>
    )
  }

}