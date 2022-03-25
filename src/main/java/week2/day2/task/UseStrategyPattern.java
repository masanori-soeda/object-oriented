package week2.day2.task;

/**
 * ルール2．else句を使用しないこと
 *
 * Hint GoFのデザインパターンのうちStrategyパターンを利用する
 *
 * @author soepy
 *
 */
public class UseStrategyPattern {

	public static final int ADDITION = 1;
	public static final int SUBSTRACTION = 2;

	private int type;

	public UseStrategyPattern(int type) {
		this.type = type;
	}

	public int calculate(int a, int b) {
		int result = 0;
		if (type == ADDITION) {
			result = a + b;
		} else if (type == SUBSTRACTION) {
			result = a - b;
		}
		return result;
	}
}
