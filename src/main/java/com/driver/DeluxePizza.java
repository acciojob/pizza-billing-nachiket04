package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        int price = this.getPrice();
        price += 80;
        if(isVeg){
            price += 70;
        }
        else{
            price += 120;
        }
        this.setPrice(price);
        hs.add("Cheese");
        hs.add("Toppings");
    }
}
