package factory.abstractfactory.meals.pizza;

import factory.abstractfactory.meals.Meal;

public class Dinner implements Meal {
    private String description;

    public Dinner(){
        description = "Hot, fresh pizza ordered from the best local pizza shop.";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
