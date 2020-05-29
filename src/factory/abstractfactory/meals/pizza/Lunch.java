package factory.abstractfactory.meals.pizza;

import factory.abstractfactory.meals.Meal;

public class Lunch implements Meal {
    private String description;

    public Lunch(){
        description = "The pizza that wasn't taken for breakfast, now re-heated in the oven. Some say that oven-re-heated pizza is best after all.";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
