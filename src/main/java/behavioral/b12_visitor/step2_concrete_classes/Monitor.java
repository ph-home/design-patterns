package behavioral.b12_visitor.step2_concrete_classes;

import behavioral.b12_visitor.step1_interface.ComputerPart;
import behavioral.b12_visitor.step3_interface_visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}