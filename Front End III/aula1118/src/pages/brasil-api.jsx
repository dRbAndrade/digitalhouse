import { Component } from 'react';
import { Link } from 'react-router-dom';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import '../styles/cep.scss'
import dechamps from '../services/dechamps';

export default class BrasilAPICEP extends Component {
  constructor() {
    super();
    this.state = {
      endereco: {}
    }
  }

  handleSubmit = async ({ cep }) => {
    try {
      const response = await dechamps.get(`${cep}`);
      this.setState({ endereco: response.data });
    } catch (error) {
      Swal.fire({
        title: 'Easter egg',
        icon: 'error',
        text: 'Você me encontrou!'
      });
    }
  }

  render() {
    return (
      <>
        <main className="main">
          <Link to="/">Ir para ViaCEP</Link>
            <h2>Procure um CEP</h2>
            <Formik initialValues={{ cep: '' }} onSubmit={this.handleSubmit}>
              <Form>
                <Field placeholder="Insira o CEP" required type="text" name="cep" id="cep" className="form-field" />
                <button type="submit" className="">Pesquisar</button>
              </Form>
            </Formik>
            {this.state.endereco.cep && (
              <ul className="list-group my-3">
                <li>{this.state.endereco.cep}</li>
                <li>{this.state.endereco.state}</li>
                <li>{this.state.endereco.city}</li>
                <li>{this.state.endereco.neighborhood}</li>
                <li>{this.state.endereco.street}</li>
              </ul>
            )}
        </main>
      </>
    );
  }
}
