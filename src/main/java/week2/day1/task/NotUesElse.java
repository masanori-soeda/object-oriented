package week2.day1.task;

/**
 * ルール2．else句を使用しないこと
 *
 * Hint アーリーリターンに変えてみる
 *
 * @author soepy
 *
 */
public class NotUesElse {

	public String getGrade(int score) {
		if (score > 80) {
			return "A";
		} else {
			if (score > 60) {
				return "B";
			} else {
				return "C";
			}
		}
	}
}
