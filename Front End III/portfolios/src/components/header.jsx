import { Component } from "react";
import '../styles/header.scss'

export default class Header extends Component{

    constructor(){
        super();
        this.state={}
    }

    render(){
        return(
            <header id="header" className="header">
                <nav className="navbar">
                  <a href="#home">Home</a>
                  <a href="#projects">Projects</a>
                </nav>
            </header>
        )
    }

}