package structural.s03_filter.step2_criteria_interface;

import structural.s03_filter.step1_class_to_apply_criteria.Person;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
