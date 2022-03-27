package week3.answer;

import week3.answer.vo.AgeVo;
import week3.answer.vo.NameVo;

public class UseValueObjectAnswer {

	private NameVo name;
	private AgeVo age;

	public UseValueObjectAnswer(NameVo name, AgeVo age) {
		this.name = name;
		this.age = age;
	}

	public String selfIntroduction() {
		StringBuffer sb = new StringBuffer();
		sb.append("私の名前は「");
		sb.append(this.name.getName());
		sb.append("」です。年齢は「");
		sb.append(this.age.getAge());
		sb.append("歳」です。");

		return sb.toString();
	}
}
