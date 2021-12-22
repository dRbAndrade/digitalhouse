import {BrowserRouter,Routes,Route,Link} from "react-router-dom"
import Home from "./home"
import BrasilAPI from "./brasil-api"
import { Component } from "react"
import Repository from "./repository"
import NotFound from './not-found'

export default class RouteList extends Component {

    render(){
      return(
        <BrowserRouter>
        <nav>
          <Link to="/">Ir para Home</Link>
          <Link to="/dRbAndrade/digitalhouse/">Repository</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path=":repositoryOwner/:repositoryName" element={<Repository/>}/>
          <Route path="/dechamps" element={<BrasilAPI/>}/>
          <Route path="*" element={<NotFound/>}/>
        </Routes>
      </BrowserRouter>
      )
    }

}