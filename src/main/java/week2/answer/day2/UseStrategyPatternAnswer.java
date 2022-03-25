package week2.answer.day2;

import week2.answer.day2.type.TypeAnswer;
import week2.answer.day2.type.TypeFactoryAnswer;

/**
 * ルール2．else句を使用しないこと
 *
 * Hint GoFのデザインパターンのうちStrategyパターンを利用する
 *
 * @author soepy
 *
 */
public class UseStrategyPatternAnswer {

	private TypeAnswer type;

	public UseStrategyPatternAnswer(int type) {
		this.type = TypeFactoryAnswer.init(type);
	}

	public int calculate(int a, int b) {
		if (type == null) {
			return 0;
		}
		return type.execute(a, b);
	}
}
