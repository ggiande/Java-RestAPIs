package com.example.restapi;

import io.swagger.annotations.ApiModelProperty;

public class CartItem {

    @ApiModelProperty(notes="item id", name="id", required=true)
    private int id;
    private String name;
    private int price;

    /* Constructor with all name space fields*/
    public CartItem(int id, String name, int price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }
    /*Getters and Setters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
