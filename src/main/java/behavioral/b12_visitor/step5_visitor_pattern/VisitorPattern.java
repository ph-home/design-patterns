package behavioral.b12_visitor.step5_visitor_pattern;

import behavioral.b12_visitor.step1_interface.ComputerPart;
import behavioral.b12_visitor.step2_concrete_classes.Computer;
import behavioral.b12_visitor.step4_concrete_visitor.ComputerPartDisplayVisitor;

public class VisitorPattern {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
