import { Component } from "react";
import "../styles/footer.scss"
import "../fonts/style.css"
export default class Footer extends Component{
    constructor(){
        super();
        this.state={}
    }

    render(){
        return(
            <footer className="footer">
              <a href="https://github.com/dRbAndrade" target="_blank" rel="noreferrer"><i className="icon-github"></i></a>
              <a href="https://www.linkedin.com/in/matheus-drb-andrade/" target="_blank" rel="noreferrer"><i className="icon-linkedin"></i></a>
            </footer>
        )
    }

}