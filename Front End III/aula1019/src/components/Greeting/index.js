const Greeting = (props) =>{
    
    const greeted = () =>
        props.user.lastName === "01" ?
         `${props.user.firstName} ${props.user.lastName}` : 'Turma desconhecida';

    return (<h1>Olá, {greeted()}</h1>);
}

export default Greeting;