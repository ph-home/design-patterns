package behavioral.b12_visitor.step1_interface;

import behavioral.b12_visitor.step3_interface_visitor.ComputerPartVisitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
