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
		sb.append("���̖��O�́u");
		sb.append(this.name.getName());
		sb.append("�v�ł��B�N��́u");
		sb.append(this.age.getAge());
		sb.append("�΁v�ł��B");

		return sb.toString();
	}
}
