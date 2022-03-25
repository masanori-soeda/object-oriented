package week2.answer.day2.type;

import week2.answer.day2.calculation.AdditionAnswer;
import week2.answer.day2.calculation.SubstractionAnswer;

public class TypeFactoryAnswer {

	public static final int ADDITION = 1;
	public static final int SUBSTRACTION = 2;

	public static TypeAnswer init(int type) {
		if (type == ADDITION) {
			return new AdditionAnswer();
		} else if (type == SUBSTRACTION) {
			return new SubstractionAnswer();
		}
		return null;
	}

}
