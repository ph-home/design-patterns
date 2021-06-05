package behavioral.b12_visitor.step2_concrete_classes;

import behavioral.b12_visitor.step1_interface.ComputerPart;
import behavioral.b12_visitor.step3_interface_visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart part : parts) {
			part.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}