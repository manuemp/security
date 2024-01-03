package cl.javadevs.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class pruebasController {

//    @RequestMapping(value= "/loginPage", method = RequestMethod.GET)
    @GetMapping("/loginPage")
    public String iniciarSesion(){
        return "login_form";
    }

}
