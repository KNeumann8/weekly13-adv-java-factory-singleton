package factory.abstractfactory.meals.pizza;

import factory.abstractfactory.meals.Meal;
import factory.abstractfactory.meals.MealFactory;

public class PizzaMealFactory implements MealFactory {
    @Override
    public Meal getMeal(String mealType) {
        switch (mealType) {
            case "breakfast":
                return new Breakfast();
            case "lunch":
                return new Lunch();
            case "dinner":
                return new Dinner();
            default:
                return null;
        }

    }
}
