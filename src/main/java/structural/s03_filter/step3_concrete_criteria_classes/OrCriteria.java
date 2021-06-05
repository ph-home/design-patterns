package structural.s03_filter.step3_concrete_criteria_classes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import structural.s03_filter.step1_class_to_apply_criteria.Person;
import structural.s03_filter.step2_criteria_interface.Criteria;

public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return Stream.concat(
				criteria.meetCriteria(persons).stream(),
				otherCriteria.meetCriteria(persons).stream())
		.collect(Collectors.toList());
	}
}
