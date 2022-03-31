package week4.task;

import week4.task.vo.User;

/**
 * ルール4．1行につきドットは1つまでにすること
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
		addressSb.append("は");
		addressSb.append(user.getAddress().getPref());
		addressSb.append(user.getAddress().getCity());
		addressSb.append("に住んでいる");
		return addressSb.toString();
	}
}
