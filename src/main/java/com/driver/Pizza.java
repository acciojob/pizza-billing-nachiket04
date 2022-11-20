package com.driver;

import java.util.HashSet;

public class Pizza {

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
    private Boolean isVeg;
    private String bill;

    HashSet <String> hs = new HashSet<>();

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
            bill = ("Base Price Of The Pizza: 300" + "\n");
        }
        else{
            price = 400;
            bill = ("Base Price Of The Pizza: 400" + "\n");
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!hs.contains("Cheese")){
            price += 80;
            bill += ("Extra Cheese Added: 80" + "\n");
            hs.add("Cheese");
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!hs.contains("Toppings")){
            if(isVeg){
                price += 70;
                bill += ("Extra Toppings For Veg Pizza = 70" + "\n");
            }
            else{
                price += 120;
                bill += ("Extra Toppings For Non-veg Pizza = 120" + "\n");
            }
            hs.add("Toppings");
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!hs.contains("TA")){
            price += 20;
            bill += ("Paper bag Price = 20" + "\n");
            hs.add("TA");
        }
    }

    public String getBill(){
        // your code goes here
        bill += ("Total Price: " + this.price + "\n");
        return this.bill;
    }
}
