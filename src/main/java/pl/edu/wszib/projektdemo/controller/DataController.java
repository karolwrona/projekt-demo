package pl.edu.wszib.projektdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.projektdemo.dao.SelectedColorDao;
import pl.edu.wszib.projektdemo.domain.SelectedColor;

@Controller
public class DataController {
    @Value("${app.header.data}")
    private String title;
    @Autowired
    SelectedColorDao selectedColorDao;
    @GetMapping("/data")
    public String dataPage(Model model){
        Iterable<SelectedColor> selectedColors = selectedColorDao.findAll();
        model.addAttribute("selectedColors", selectedColors);
        model.addAttribute("title", title);
        return"data";
    }
}
