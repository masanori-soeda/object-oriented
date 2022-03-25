package week2.day2.answer;

import week2.day2.answer.type.TypeAnswer;
import week2.day2.answer.type.TypeFactoryAnswer;

/**
 * ���[��2�Delse����g�p���Ȃ�����
 *
 * Hint GoF�̃f�U�C���p�^�[���̂���Strategy�p�^�[���𗘗p����
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
