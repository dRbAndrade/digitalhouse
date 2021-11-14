import { Component } from "react";
import { Formik, Form, Field } from "formik";
import Swal from 'sweetalert2';
import '../styles/main.scss'

export default class Main extends Component {

    handleSubmit = ({name,email,phone})=>{
      if(name === '' || phone  === '' || email === ''){
        Swal.fire({
        title: "O formulário não foi preenchido corretamente",
        icon: "error",
        text: 'Por favor verifique se os campos "Nome", "Telefone" e "Email" foram preenchidos'
        });
    }
    else {
        Swal.fire({ 
        title: "Valores Enviados:",
        icon: "success",
        html: `Nome: ${name} <br> Telefone: ${phone} <br> Email: ${email}`
        })
    }
    }

  render() {
    return (
      <>
        <Formik initialValues={{ name: "",email:"exemplo@gmail.com", phone: "" }}onSubmit={this.handleSubmit}>
          <Form className="form">
            <Field type="text" name="name" id="name" className="field" />
            <Field type="email" name="email" id="email" className="field" />
            <Field type="text" name="phone" id="phone" className="field" />
            <button type="submit">Enviar</button>
          </Form>
        </Formik>
      </>
    );
  }
}
