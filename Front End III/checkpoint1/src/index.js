import React from 'react';
import ReactDOM from 'react-dom';
import "./styles/index.scss"
import Header from './components/header.jsx'
import Main from './components/main.jsx'
import Footer from './components/footer.jsx'

ReactDOM.render(
  <React.StrictMode>
    <Header></Header>
    <Main></Main>
    <Footer></Footer>
  </React.StrictMode>,
  document.getElementById('root')
);

