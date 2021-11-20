import { Component } from "react";
import CardContainer from "./card-container.jsx"
import Banner from "./banner.jsx"
import "../styles/main.scss"

export default class Main extends Component{

    constructor(){
        super();
        this.state={}
    }

    render(){
        return(
            <main className="main">
              <Banner/>
              <CardContainer/>
            </main>
        )
    }

}