package com.jb.T11OOPSAgain;
public class RecipeWithMicroWave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw marterials");
        System.out.println("switch on the microwave");
    }
    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }
    @Override
    void cleanUp() {
        System.out.println("Clean UP the utensils");
        System.out.println("switch off the microwave");
    }
    public static void main(String[] args) {
        RecipeWithMicroWave recipeWithMicroWave=new RecipeWithMicroWave();
        recipeWithMicroWave.execute();
    }   
}
// Get the raw marterials
// switch on the microwave
// do the dish
// Clean UP the utensils
// switch off the microwave
