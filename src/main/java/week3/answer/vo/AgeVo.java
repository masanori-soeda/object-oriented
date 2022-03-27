package week3.answer.vo;

import java.text.ParseException;

public class AgeVo {
	private String age;

	private AgeVo(String age) {
		this.age = age;
	}

	public static AgeVo is(String age) throws ParseException {
		int ageInt = 0;
		try {
			ageInt = Integer.parseInt(age);
		} catch (Exception e) {
			throw new ParseException("数字を入力してください", 0);
		}
		if (ageInt < 0) {
			throw new IllegalArgumentException("マイナスの値は年齢として登録できません。");
		}
		return new AgeVo(age);
	}

	public String getAge() {
		return age;
	}
}
