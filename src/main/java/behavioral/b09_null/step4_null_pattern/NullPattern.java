package behavioral.b09_null.step4_null_pattern;

import behavioral.b09_null.step1_abstract_class.AbstractCustomer;
import behavioral.b09_null.step3_factory_class.CustomerFactory;

public class NullPattern {
	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}