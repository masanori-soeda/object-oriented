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
			throw new ParseException("��������͂��Ă�������", 0);
		}
		if (ageInt < 0) {
			throw new IllegalArgumentException("�}�C�i�X�̒l�͔N��Ƃ��ēo�^�ł��܂���B");
		}
		return new AgeVo(age);
	}

	public String getAge() {
		return age;
	}
}
