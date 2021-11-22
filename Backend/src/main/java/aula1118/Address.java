package aula1118;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONException;
import org.json.JSONObject;

@Getter
@Setter
public class Address {

    private String CEP;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    public Address() {}

    public Address(String cep, String street, String neighborhood, String city, String state) {
        this.CEP = cep;
        this.logradouro = street;
        this.bairro = neighborhood;
        this.cidade = city;
        this.uf = state;
    }
    public Address(JSONObject json) throws JSONException {
        this.CEP = json.getString("cep");
        this.logradouro = json.getString("logradouro");
        this.bairro = json.getString("bairro");
        this.cidade = json.getString("localidade");
        this.uf = json.getString("uf");
    }

}
