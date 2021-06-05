package behavioral.b04_iterator.step3_iterator_pattern;


import behavioral.b04_iterator.step1_interfaces.Iterator;
import behavioral.b04_iterator.step2_concrete_classes.NameRepository;

public class IteratorPattern {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
			System.out.printf("Name: %s%n", iterator.next());
		}
	}
}
