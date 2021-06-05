package structural.s03_filter.step4_criteria_pattern;

import structural.s03_filter.step1_class_to_apply_criteria.Person;
import structural.s03_filter.step2_criteria_interface.Criteria;
import structural.s03_filter.step3_concrete_criteria_classes.*;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPattern {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", Person.GENDER_MALE, Person.MARITAL_STS_SINGLE));
        persons.add(new Person("John", Person.GENDER_MALE, Person.MARITAL_STS_MARRIED));
        persons.add(new Person("Laura", Person.GENDER_FEMALE, Person.MARITAL_STS_MARRIED));
        persons.add(new Person("Diana", Person.GENDER_FEMALE, Person.MARITAL_STS_SINGLE));
        persons.add(new Person("Mike", Person.GENDER_MALE, Person.MARITAL_STS_SINGLE));
        persons.add(new Person("Bobby", Person.GENDER_MALE, Person.MARITAL_STS_SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        printPersons("males", male.meetCriteria(persons));
        printPersons("females", female.meetCriteria(persons));
        printPersons("single", single.meetCriteria(persons));
        printPersons("single and male", singleMale.meetCriteria(persons));
        printPersons("single or female", singleOrFemale.meetCriteria(persons));

    }

    private static void printPersons(String label, List<Person> persons) {
        System.out.printf("%%n%s:%n", label);
        for (Person person : persons) {
            System.out.printf("Person: [ name: %-10s, gender: %-10s, married: %-10s]%n", person.getName(),
                    person.getGenderDescription(), person.getMaritalDescription());
        }
    }
}
