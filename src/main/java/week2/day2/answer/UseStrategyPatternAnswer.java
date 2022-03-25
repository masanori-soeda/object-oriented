package week2.day2.answer;

import week2.day2.answer.type.TypeAnswer;
import week2.day2.answer.type.TypeFactoryAnswer;

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
