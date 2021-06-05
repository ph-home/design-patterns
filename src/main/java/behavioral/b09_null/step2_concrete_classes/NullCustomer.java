package behavioral.b09_null.step2_concrete_classes;

import behavioral.b09_null.step1_abstract_class.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}
