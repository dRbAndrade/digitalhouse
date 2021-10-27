import Header from './components/header.jsx';
import Banner from './components/banner.jsx'
import './App.css';

function App() {
  return (
    <div className="App">
      <Header/>
      <Banner>
        Watch It!
        <button>Kozuki Akazaya</button>
      </Banner>
    </div>
  );
}

document.querySelector('button').addEventListener('click',(event)=>{
  event.preventDefault();
  window.open("https://www.youtube.com/watch?v=lgI5RoGEvsc",'_blank').focus();
});
export default App;
