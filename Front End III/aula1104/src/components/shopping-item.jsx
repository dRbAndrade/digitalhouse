import { Component} from "react";
import "../styles/shopping-item.scss"
export default class ShoppingItem extends Component {
    
    originalState = [
        {
            id:1,
            name : "Coca",
            url : "https://static.clubeextra.com.br/img/uploads/1/844/19796844.jpg"
        },
        {
            id:2,
            name : "Oreo",
            url : "https://pbs.twimg.com/profile_images/1316015797559422978/w2JmFyYt_400x400.jpg"
        },
        {
            id:3,
            name : "Brocolis",
            url : "https://i2.wp.com/blog.plantei.com.br/wp-content/uploads/2016/12/como-plantar-brocolis.jpg"
        },
    ];

    constructor(){
        super();

        this.state={ 
            currentState:this.originalState 
        }

    }

    deleteElement=(id)=>{

        const newState=this.state.currentState.filter(e=>e.id!==id);
        console.log(newState);
        this.setState({
            currentState:newState
        });

    }

    refresh=()=>{
        this.setState({currentState:this.originalState})
    }
    render(){
        return(
            <>
            <button onClick={(event)=>{
                event.preventDefault();
                this.refresh();
            }}>refresh</button>
            <div className="container">
                {this.state.currentState.map((element)=>{
                    return(
                        <div key={element.id} className="item" onClick={()=>this.deleteElement(element.id)}>
                            <img src={element.url} alt={element.name} />
                            <h3>{element.name}</h3>
                        </div>
                    )
                })}
            </div>
            </>
        )
    }

}