package com.example.restaurantsiteproject.logic;

public class Dish {
    private Integer id;
    private String name;
    private Integer cost;
    private Integer type;
    private String description;
    private String image;

    public Dish(Integer id, String name, Integer cost, Integer type, String description, String image) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.description = description;
        this.image = image;
    }
    public Dish() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
