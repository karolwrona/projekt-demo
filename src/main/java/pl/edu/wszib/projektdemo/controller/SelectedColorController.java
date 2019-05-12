package pl.edu.wszib.projektdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedColorController {

    @Value("${app.header.select_color}")
    private String title;

    @GetMapping("/select")
    public String selectColorPage(Model model){

        String[][] colors = {
                {"red","blue"},
                {"black, yellow"}
        };

        model.addAttribute("title", title);
        model.addAttribute("colors", colors);
        return"select";
    }
    @GetMapping("/stat")
    public String statPage(){
        return"stat";
    }
    @GetMapping("/data")
    public String dataPage(){
        return"data";
    }
}
