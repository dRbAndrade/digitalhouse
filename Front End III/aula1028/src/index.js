import React from 'react';
import ReactDOM from 'react-dom';
import './styles/index.css';
import ClassComponent from './components/ClassComponent.jsx'
import FunctionComponent from './components/FunctionComponent.jsx'


ReactDOM.render(
  <React.StrictMode>
  <fieldset>
    <div>
      <p>Convidados:</p>
      <ClassComponent name="Matheus" isInvited={false}/>
      <ClassComponent name="Chucre" isInvited={true}/>
      <ClassComponent name="Andrade" isInvited={true}/>
    </div>
    <div>
      <p>Tarefas:</p>
      <FunctionComponent name="Matheus"/>
      <FunctionComponent name="Chucre"/>
      <FunctionComponent name="Andrade"/>
    </div>
  </fieldset>
  </React.StrictMode>,
  document.getElementById('root')
);
