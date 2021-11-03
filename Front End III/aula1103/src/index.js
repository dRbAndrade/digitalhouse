import React from 'react';
import ReactDOM from 'react-dom';
import './index.scss';
import InvitationList from "./components/invitation-list.jsx"

ReactDOM.render(
  <React.StrictMode>
    <InvitationList></InvitationList>
  </React.StrictMode>,
  document.getElementById('root')
);