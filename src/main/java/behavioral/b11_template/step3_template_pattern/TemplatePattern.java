package behavioral.b11_template.step3_template_pattern;

import behavioral.b11_template.step1_abstract_template.Game;
import behavioral.b11_template.step2_concrete_classes.Cricket;
import behavioral.b11_template.step2_concrete_classes.Football;

public class TemplatePattern {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
