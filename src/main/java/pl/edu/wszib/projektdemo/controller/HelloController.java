package pl.edu.wszib.projektdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloPage() {
        return "Hello!";
    }
    @GetMapping("/test")
    public String testPage() {
        return "Metoda testowa"+System.lineSeparator()+HelloController.class.getCanonicalName();
    }

}
