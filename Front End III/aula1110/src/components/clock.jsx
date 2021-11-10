import { Component } from "react";

export default class Clock extends Component{

    constructor(){
        super();
        this.state={
            clock:60
        }
    }

    componentDidMount(){
        this.countdown=setInterval(e=>{
            this.setState({
                clock:this.state.clock-1
            })
        },1000);
    }

    componentDidUpdate(){
        if(this.state.clock===0)clearInterval(this.countdown);
    }

    render(){
        return(
            <div>
                {this.state.clock}
            </div>
        );
    }

}