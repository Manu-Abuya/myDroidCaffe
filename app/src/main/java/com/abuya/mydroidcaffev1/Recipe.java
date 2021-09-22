package com.abuya.mydroidcaffev1;

public class Recipe {
    //Declare private member variables
    private final int recipeImage;
    private String recipeTitle;
    private String recipeDescription;

    /*
    Create a constructor for the recipe data model
    Pass the parameters recipeImage, recipeTitle and recipeDescription
     */
    Recipe(int recipeImage, String recipeTitle, String recipeDescription){
        this.recipeImage = recipeImage;
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
    }

    /*
    Create getters and return the specific object
     */
    public int getRecipeImage(){
        return recipeImage;
    }

    public String getRecipeTitle(){
        return recipeTitle;
    }

    public String getRecipeDescription(){
        return recipeDescription;
    }
}
