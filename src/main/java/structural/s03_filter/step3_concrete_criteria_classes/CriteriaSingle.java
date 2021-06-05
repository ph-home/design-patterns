package structural.s03_filter.step3_concrete_criteria_classes;

import java.util.List;
import java.util.stream.Collectors;

import structural.s03_filter.step1_class_to_apply_criteria.Person;
import structural.s03_filter.step2_criteria_interface.Criteria;

public class CriteriaSingle implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream()
				.filter(person -> person.getMaritalStatus() == Person.MARITAL_STS_SINGLE)
				.collect(Collectors.toList());
	}
}
