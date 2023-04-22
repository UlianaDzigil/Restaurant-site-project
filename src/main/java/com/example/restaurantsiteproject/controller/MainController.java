package com.example.restaurantsiteproject.controller;

import com.example.restaurantsiteproject.logic.Dish;
import com.example.restaurantsiteproject.repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private Dao dao;
    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @GetMapping("/main")
    public String getMainPage(Model model){
        return "main";
    }

    @GetMapping("/menu")
    public String getMenuPage(Model model){
        List<Dish> dishes = this.dao.getDishes();
        List<Dish> apetizers = new ArrayList<>();
        List<Dish> mains = new ArrayList<>();
        List<Dish> desserts = new ArrayList<>();
        List<Dish> coctails = new ArrayList<>();
        for (Dish dish : dishes) {
            if(dish.getType() == 1){
                apetizers.add(dish);
            } else if (dish.getType() == 2) {
                mains.add(dish);
            } else if (dish.getType() == 3) {
                desserts.add(dish);
            } else if (dish.getType() == 4) {
                coctails.add(dish);
            }
        }
        model.addAttribute("listOfApetizers", apetizers);
        model.addAttribute("listOfMains", mains);
        model.addAttribute("listOfDesserts", desserts);
        model.addAttribute("listOfCoctails", coctails);
        return "menu";
    }
}
