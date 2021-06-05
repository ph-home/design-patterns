package structural.s03_filter.step3_concrete_criteria_classes;

import java.util.List;

import structural.s03_filter.step1_class_to_apply_criteria.Person;
import structural.s03_filter.step2_criteria_interface.Criteria;

public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return otherCriteria.meetCriteria(
				criteria.meetCriteria(persons));
	}
}
