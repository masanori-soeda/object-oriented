package week4.task;

import week4.task.vo.User;

/**
 * ���[��4�D1�s�ɂ��h�b�g��1�܂łɂ��邱��
 *
 * @author soepy
 *
 */
public class SingleDotAtOneLine {

	private User user;

	public SingleDotAtOneLine(User user) {
		this.user = user;
	}

	public String getPrefCity() {
		StringBuffer addressSb = new StringBuffer();
		addressSb.append(user.getName());
		addressSb.append("��");
		addressSb.append(user.getAddress().getPref());
		addressSb.append(user.getAddress().getCity());
		addressSb.append("�ɏZ��ł���");
		return addressSb.toString();
	}
}
