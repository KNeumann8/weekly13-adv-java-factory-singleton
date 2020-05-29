package factory.abstractfactory.meals;


import factory.abstractfactory.meals.german.GermanMealFactory;
import factory.abstractfactory.meals.pizza.PizzaMealFactory;

public class MealDriver {

    public static void main(String[] args) {
        MealFactory mealFactory = new PizzaMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
