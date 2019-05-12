package pl.edu.wszib.projektdemo.dao;

import org.springframework.data.repository.CrudRepository;
import pl.edu.wszib.projektdemo.domain.SelectedColor;

import java.util.List;

public interface SelectedColorDao extends CrudRepository<SelectedColor, Integer> {
    List<SelectedColor> findByColor (String color);
}
