package com.codewithRif.oauth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Contenu accessible pour tout le monde  ";
    }

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "vous n'êtes pas besoin de vous authentifier";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "Vous êtes connecté avec succées "  
        		+  " bienvenue chez RifOauth 2.0 ";
    }
}
