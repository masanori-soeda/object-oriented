package week2.day1.task;

/**
 * ���[��2�Delse����g�p���Ȃ�����
 *
 * Hint �A�[���[���^�[���ɕς��Ă݂�
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