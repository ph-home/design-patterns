package behavioral.b09_null.step2_concrete_classes;

import behavioral.b09_null.step1_abstract_class.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}