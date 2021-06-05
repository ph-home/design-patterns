package behavioral.b04_iterator.step2_concrete_classes;

import behavioral.b04_iterator.step1_interfaces.Container;
import behavioral.b04_iterator.step1_interfaces.Iterator;

public class NameRepository implements Container {
	private static final String[] NAMES = {"Robert", "John", "Julie", "Laura"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() { return index < NAMES.length; }

		@Override
		public Object next() {
			return this.hasNext() ? NAMES[index++] : null;
		}
	}
}
