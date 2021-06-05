package behavioral.b06_memento.step3_care_taker_class;

import java.util.ArrayList;
import java.util.List;

import behavioral.b06_memento.step1_memento_class.Memento;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}
