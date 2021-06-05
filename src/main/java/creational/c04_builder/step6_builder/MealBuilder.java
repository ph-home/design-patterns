package creational.c04_builder.step6_builder;

import creational.c04_builder.step4_classes.ChickenBurger;
import creational.c04_builder.step4_classes.Coke;
import creational.c04_builder.step4_classes.CokeDiet;
import creational.c04_builder.step4_classes.VegBurger;
import creational.c04_builder.step5_composite_class.Meal;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNormalMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new CokeDiet());
		return meal;
	}
}
