package week2.day2.answer.type;

import week2.day2.answer.calculation.AdditionAnswer;
import week2.day2.answer.calculation.SubstractionAnswer;

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
