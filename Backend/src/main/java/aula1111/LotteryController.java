package aula1111;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loteria")
public class LotteryController {

    @Autowired
    private LotteryService service;

    @GetMapping("aleatorio")
    public String getRandomGame(){
        return service.generateRandomGames(1).toString();
    }

    @GetMapping("aleatorio/{quantity}")
    public String getRandomGame(@PathVariable int quantity){
        return service.generateRandomGames(quantity).toString();
    }

}
