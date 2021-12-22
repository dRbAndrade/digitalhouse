import { Component } from "react";
import {Formik, Form, Field} from "formik";
import "../styles/cep.scss"
import Swal from "sweetalert2";
import api from "../services/viacep";

export default class Cep extends Component{

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
      console.log(response);
    }catch(error){
      console.log(error);
      Swal.fire({
        icon:'error',
        html:
        `
        <div style="text-align:left;">
        <p style="color:#000;margin-bottom:1rem;">@Autowired</p>
        <p style="color:#000;">private Error error;</p>
        </div>`
      });
    }
  }

  render(){
    return(
      <main className="main">
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
          </ul>
        </div>
      </main>
    );
  }

 

}