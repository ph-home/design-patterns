package behavioral.b09_null.step3_factory_class;

import behavioral.b09_null.step1_abstract_class.AbstractCustomer;
import behavioral.b09_null.step2_concrete_classes.NullCustomer;
import behavioral.b09_null.step2_concrete_classes.RealCustomer;

public class CustomerFactory {
    protected static final String[] names = {"Rob", "Joe", "Julie"};

    private CustomerFactory() {
    }

    public static AbstractCustomer getCustomer(String name) {

        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
