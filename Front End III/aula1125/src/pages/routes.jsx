import {BrowserRouter,Routes,Route,Link} from "react-router-dom"
import { Component } from "react"
import Home from "./home"
import BrasilAPI from "./brasil-api"
import NotFound from "./not-found"
import DDD from "./ddd"

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
          <Route path="/dechamps" element={<BrasilAPI/>}/>
          <Route path="/ddd/:ddd" element ={<DDD/>}/>
          <Route path="*" element={<NotFound/>}/>

        </Routes>
      </BrowserRouter>
      )
    }

}