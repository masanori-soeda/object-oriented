package week3.answer.vo;

public class NameVo {

	private String name;

	private NameVo(String name) {
		this.name = name;
	}

	public static NameVo is(String name) {
		if (name == null) {
			throw new IllegalArgumentException("���O�����͂���Ă��܂���");
		}
		return new NameVo(name);
	}

	public String getName() {
		return name;
	}

}
