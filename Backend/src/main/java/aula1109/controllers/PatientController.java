package aula1109.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @GetMapping("/index")
    public String welcome(Model model){
        model.addAttribute("name","Matheus");
        return "index";
    }

}
