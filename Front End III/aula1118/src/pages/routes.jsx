import {BrowserRouter,Routes,Route} from "react-router-dom"
import Home from "./home"
import BrasilAPI from "./brasil-api"
import { Component } from "react"

export default class RouteList extends Component {

    render(){
      return(
        <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/dechamps" element={<BrasilAPI/>}/>
        </Routes>
      </BrowserRouter>
      )
    }

}