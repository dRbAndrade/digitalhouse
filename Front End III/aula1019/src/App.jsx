import './App.css';
import Greeting from "./components/Greeting"

function App() {

  const user = {    

    firstName: 'Turma',
    lastName: '01'

  }

  return (
    <div className="App">
        <h1>Hello World!!</h1>
        <Greeting user={user}/>
    </div>
  );
}

export default App;
