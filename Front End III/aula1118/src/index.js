import React from 'react';
import ReactDOM from 'react-dom';
import './styles/index.scss';
import RouteList from "./pages/routes"

ReactDOM.render(
  <React.StrictMode>
    <RouteList/>
  </React.StrictMode>,
  document.getElementById('root')
);