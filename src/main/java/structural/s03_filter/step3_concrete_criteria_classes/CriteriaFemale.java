package structural.s03_filter.step3_concrete_criteria_classes;

import java.util.List;
import java.util.stream.Collectors;

import structural.s03_filter.step1_class_to_apply_criteria.Person;
import structural.s03_filter.step2_criteria_interface.Criteria;

public class CriteriaFemale implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream()
				.filter(person -> person.getGender() == Person.GENDER_FEMALE)
				.collect(Collectors.toList());
	}
}
