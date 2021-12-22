import axios from "axios"

const dechamps = axios.create({
  baseURL: "https://brasilapi.com.br/api/cep/v1"
})

export default dechamps