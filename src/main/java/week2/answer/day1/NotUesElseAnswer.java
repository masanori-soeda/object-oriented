package week2.answer.day1;

/**
 * ���[��2�Delse����g�p���Ȃ�����
 *
 * Hint �A�[���[���^�[���ɕς��Ă݂�
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
