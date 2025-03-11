package com.jb.T11OOPSAgain;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the raw marterials");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean UP the utensils");
    }
    public static void main(String[] args) {
        Recipe1 recipe1=new Recipe1();
        recipe1.execute();
    }
}
// Get the raw marterials
// do the dish
// Clean UP the utensils