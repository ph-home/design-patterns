package structural.s03_filter.step1_class_to_apply_criteria;

public class Person {
	public static final int GENDER_MALE = 1;
	public static final int GENDER_FEMALE = 2;
	public static final int MARITAL_STS_MARRIED = 1;
	public static final int MARITAL_STS_SINGLE = 2;

	private String name;
	private int gender;
	private int maritalStatus;

	public Person(String name, int gender, int maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getMaritalStatus() {
		return maritalStatus;
	}

	public String getGenderDescription() {
		return switch (gender) {
			case GENDER_MALE -> "male";
			case GENDER_FEMALE -> "female";
			default -> "system overload";
		};
	}

	public String getMaritalDescription() {
		return switch (maritalStatus) {
			case MARITAL_STS_MARRIED -> "married";
			case MARITAL_STS_SINGLE -> "single";
			default -> "tinder customer";
		};
	}
}
