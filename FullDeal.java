package com.example.jeff.happyhokie;

import java.util.List;

/**
 * Created by Jeff on 12/2/2016.
 */

public class FullDeal {

    String restaurant;
    int day;
    List<String> FoodDeals;
    List<String> DrinkDeals;

    //get Restaurant
    public String getRestaurant(){
        return restaurant;
    }

    //get food deals
    public List<String> getFoodDeals(){
        return FoodDeals;
    }
    //get Drink deals
    public List<String> getDrinkDeals(){
        return DrinkDeals;
    }


    //populate all
    public void populate(int day){
        //switch statements for days
    }
    //populate food deals
    public void populateFood(String day){
        //get deals from day
    }

    //populate drink deals
    public void populateDrink(String day){
        //get deals
    }



}
