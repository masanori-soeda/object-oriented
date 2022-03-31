package week4.answer;

import week4.answer.vo.UserAnswer;

/**
 * ���[��4�D1�s�ɂ��h�b�g��1�܂łɂ��邱��
 *
 * @author soepy
 *
 */
public class SingleDotAtOneLineAnswer {

	private UserAnswer user;

	public SingleDotAtOneLineAnswer(UserAnswer user) {
		this.user = user;
	}

	public String getPrefCity() {
		StringBuffer addressSb = new StringBuffer();
		addressSb.append(user.getName());
		addressSb.append("��");
		addressSb.append(user.getAdressPref());
		addressSb.append(user.getAdressCity());
		addressSb.append("�ɏZ��ł���");
		return addressSb.toString();
	}
}
