import Header from './components/header.jsx';
import Banner from './components/banner.jsx'
import './App.css';

function App() {

  function redirect(e){
    e.preventDefault();
    window.open('https://www.youtube.com/watch?v=lgI5RoGEvsc',"_blank").focus();
  }

  return (
    <div className="App">
      <Header/>
      <Banner>
        Watch It!
        <button onClick={redirect}>Kozuki Akazaya</button>
      </Banner>
    </div>
  );
}



export default App;
