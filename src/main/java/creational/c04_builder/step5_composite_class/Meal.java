package creational.c04_builder.step5_composite_class;

import creational.c04_builder.step1_interface.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) { items.add(item); }

	public float getCost() {
		float cost = 0;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.printf("Item %-15s packing %-15s price %10.02f%n", item.name(), item.packing().pack(), item.price());
		}
	}
}
