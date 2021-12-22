import { Component } from "react";
import {Formik, Form, Field} from "formik";
import "../styles/cep.scss"
import Swal from "sweetalert2";
import api from "../services/viacep";
import { Link } from "react-router-dom";

export default class Home extends Component{

  constructor(){
    super();
    this.state={
      cep:{}
    }
  }

  async componentDidMount(){
    this.handleSubmit({"cep":"01001000"});
  }
  handleSubmit = async ({cep})=>{
    try{
      const response = await api.get(`/${cep}/json`);
      this.setState({cep:response.data})
    }catch(error){
      Swal.fire({
        icon:'error',
        html:
        `
        <div style="text-align:left;">
        <p style="margin-bottom:1rem;">@Autowired</p>
        <p>private Error error;</p>
        </div>`
      });
    }
  }

  render(){
    return(
      <main className="main">
        <Link to="/dechamps">TESTANDO SAMERDA</Link>
        <h2>Procure CEP</h2>
        <Formik initialValues={{cep:''}} onSubmit={this.handleSubmit}>
          <Form className="form">
            <Field className="form-field" placeholder="Insira um cep (somente números)" required type="text" id="cep" name="cep"/>
            <button className="form-button" type="submit">Enviar</button>
          </Form>
        </Formik>
        <div className="cep">
          <ul>
            <li>{this.state.cep.cep}</li>
            <li>{this.state.cep.logradouro}</li>
            <li>{this.state.cep.complemento}</li>
            <li>{this.state.cep.bairro}</li>
            <li>{this.state.cep.localidade}</li>
            <li>{this.state.cep.uf}</li>
            <li><Link to={`/ddd/${this.state.cep.ddd}`}>{this.state.cep.ddd}</Link></li>
          </ul>
        </div>
      </main>
    );
  }

 

}