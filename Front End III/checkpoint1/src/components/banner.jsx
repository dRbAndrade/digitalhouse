import { Component } from "react";
import "../styles/banner.scss"
export default class Banner extends Component{

  render(){

    return(
      <div id="home" className="banner">
        <div id="logo" className="logo"><span>d</span>R<span>b</span></div>
        <div className="banner-text">
          <h1>Portifólio de estudos</h1>
          <p>Aqui estão listados alguns projetos de dentro e fora do CTD.</p>
        </div>
      </div>
    )

  }

}