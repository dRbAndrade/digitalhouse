import {Component} from 'react';

export default class ClassComponent extends Component{

    render(){

        return(
            <li>{this.props.name} {this.props.isInvited ? "está":"não está"} convidado para festa</li>
        )

    }


}