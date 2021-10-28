import {Component} from 'react';

export default class ClassComponent extends Component{

    render(){
        const {name,isInvited} = this.props;
        return(
            <li>{name} {isInvited ? "está":"não está"} convidado para festa</li>
        )

    }

}