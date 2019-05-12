package pl.edu.wszib.projektdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.StringUtils;
import pl.edu.wszib.projektdemo.dao.SelectedColorDao;
import pl.edu.wszib.projektdemo.domain.SelectedColor;

import java.util.Date;

@Controller
public class SelectedColorController {

    @Value("${app.header.select_color}")
    private String title;

    @Autowired
    SelectedColorDao selectedColorDao;

    @GetMapping({"/select", "/select/{color}"})
    public String selectColorPage(@PathVariable(required = false) String color, Model model){

        if(!StringUtils.isEmpty(color)){
        selectedColorDao.save(new SelectedColor(color, new Date()));
    }

        String[][] colors = {
                {"Silver","Blue", "Red", "Gray"},
                {"Black", "Yellow", "Purple", "Green"},
                {"Orange", "Lime", "White","Aqua"},
                {"Fuchsia", "Teal", "Navy", "Olive"}
        };

        model.addAttribute("title", title);
        model.addAttribute("colors", colors);
        return"select";
    }
    @GetMapping("/stat")
    public String statPage(){
        return"stat";
    }

}
