package factory.abstractfactory.meals.pizza;

import factory.abstractfactory.meals.Meal;

public class Breakfast implements Meal {
    private String description;

    public Breakfast(){
        description = "Last night's amazing pizza, fresh out of the fridge. Enjoy cold, or heat using microwave for your culinary delight.";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
