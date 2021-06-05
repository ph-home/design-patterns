package behavioral.b12_visitor.step4_concrete_visitor;

import behavioral.b12_visitor.step2_concrete_classes.Computer;
import behavioral.b12_visitor.step2_concrete_classes.Keyboard;
import behavioral.b12_visitor.step2_concrete_classes.Monitor;
import behavioral.b12_visitor.step2_concrete_classes.Mouse;
import behavioral.b12_visitor.step3_interface_visitor.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}
