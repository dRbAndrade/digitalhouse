import '../styles/invitation-list.scss'
const InvitationList = ()=>{

    const people = [
        {
            id:21,
            name:'Matheus',
            isInvited:true
        },
        {
            id:12213,
            name:'dRb',
            isInvited:true
        },
        {
            id:3421,
            name:'Andrade',
            isInvited:true
        },
        {
            id:23451,
            name:'Chucre',
            isInvited:true
        }
    ]

    return(
        <fieldset>
            <h3>Convidados: </h3>
            <ul>
                {
                    people.map((person)=>{
                        return(
                            <li key={person.id}>{person.name} {person.isInvited ? "está":"não está"} convidado</li>
                        )
                    })
                }
            </ul>
            <h3>Tarefas: </h3>
            <ul>
                {
                    people.map((person)=>{
                        return(
                            <li key={person.id}>{person.name} trará {randomFood()}</li>
                        )
                    })
                }
            </ul>
        </fieldset>
    );

}

function randomFood(){
    let seed = parseInt(Math.random()*4);
    switch(seed){
        case 0: return "Vatapá";
        case 1: return "Refrigerante";
        case 2: return "Maniçoba";
        default: return "Açaí";
    }
}
export default InvitationList;