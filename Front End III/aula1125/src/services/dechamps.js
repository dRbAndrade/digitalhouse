import axios from "axios"

const dechamps = axios.create({
  baseURL: "https://brasilapi.com.br/api/"
})

export default dechamps