package week4.answer;

import week4.answer.vo.UserAnswer;

/**
 * ルール4．1行につきドットは1つまでにすること
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
		addressSb.append("は");
		addressSb.append(user.getAdressPref());
		addressSb.append(user.getAdressCity());
		addressSb.append("に住んでいる");
		return addressSb.toString();
	}
}
