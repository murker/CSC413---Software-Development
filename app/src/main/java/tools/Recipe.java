package tools;

import java.util.ArrayList;

/**
 * Created by Harjit Randhawa on 10/6/2015.
 *
 * Recipe class designed to make Recipes a usable object.
 *
 * Recipe objects will be created when a query is made and the RecipeFactory
 */
public class Recipe
{

    String name, cuisine;
    ArrayList<Ingredient> ingredients;
    ArrayList<String> instructions;
    int prepTime_hours, prepTime_minutes;

    public Recipe()
    {
        init();
    }

    private void init()
    {
        ingredients = new ArrayList<Ingredient>();
        instructions = new ArrayList<String>();
        prepTime_minutes = -1;
        prepTime_hours = -1;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public String getName()
    {
        return name;
    }

    public void setCuisine(String _cuisine)
    {
        cuisine = _cuisine;
    }

    public String getCuisine()
    {
        return cuisine;
    }

    public void addIngredient(Ingredient _ingredient)
    {
        ingredients.add(_ingredient);
    }

    public ArrayList<Ingredient> getIngredients()
    {
        return ingredients;
    }

    public void addInstruction(String _instruction)
    {
        instructions.add(_instruction);
    }

    public ArrayList<String> getInstructions()
    {
        return instructions;
    }

    public void setPrepTime(int _hours, int _minutes)
    {
        prepTime_hours = _hours;
        prepTime_minutes = _minutes;
    }

    //getPrepTime_hours will return the hours it takes to cook the dish.
    //Returns -1 if no preparation time was found
    public int getPrepTime_hours()
    {
        return prepTime_hours;
    }

    //getPrepTime_minutes will return the hours it takes to cook the dish.
    //Returns -1 if no preparation time was found
    public int getPrepTime_minutes()
    {
        return prepTime_minutes;
    }

}
