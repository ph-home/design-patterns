package creational.c04_builder.step7_builder_pattern;

import creational.c04_builder.step5_composite_class.Meal;
import creational.c04_builder.step6_builder.MealBuilder;

public class BuilderPattern {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();

		Meal vegMeal = builder.prepareVegMeal();
		invoque(vegMeal);

		Meal normalMeal = builder.prepareNormalMeal();
		invoque(normalMeal);
	}

	private static void invoque(Meal meal) {
		meal.showItems();
		System.out.printf("   total cost: %10.02f%n", meal.getCost());
	}
}
