package week2.day1.answer;

/**
 * ルール2．else句を使用しないこと
 *
 * Hint アーリーリターンに変えてみる
 *
 * @author soepy
 *
 */
public class NotUesElseAnswer {

	public String getGrade(int score) {
		if (score > 80) {
			return "A";
		}
		if (score > 60) {
			return "B";
		}
		return "C";
	}
}
