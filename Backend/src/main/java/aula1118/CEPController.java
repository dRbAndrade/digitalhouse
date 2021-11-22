package aula1118;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CEPController {

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCEP(@PathVariable String cep) throws UnirestException, JSONException {

        HttpResponse<JsonNode> jsonResponse= Unirest.get("https://viacep.com.br/ws/"+cep+"/json").asJson();

        JSONObject json = jsonResponse.getBody().getObject();

        return ResponseEntity.ok(new Address(json));
    }

}
