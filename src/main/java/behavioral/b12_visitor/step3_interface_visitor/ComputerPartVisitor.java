package behavioral.b12_visitor.step3_interface_visitor;

import behavioral.b12_visitor.step2_concrete_classes.Computer;
import behavioral.b12_visitor.step2_concrete_classes.Keyboard;
import behavioral.b12_visitor.step2_concrete_classes.Monitor;
import behavioral.b12_visitor.step2_concrete_classes.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}