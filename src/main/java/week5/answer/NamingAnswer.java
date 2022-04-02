package week5.answer;

/**
 * ルール5．名前を省略しないこと
 *
 * HINT1:名前の要素が二つあるので2つに分けます
 *
 * HINT2: 元のメソッドは名前を変えて動作をあらわすものに変えましょう
 *
 * @author soepy
 *
 */
public class NamingAnswer {

	private NameVoAnswer nameVo;

	public NamingAnswer(NameVoAnswer nameVo) {
		this.nameVo = nameVo;
	}

	public String displayName() {
		StringBuffer nameSb = new StringBuffer();
		nameSb.append(getFirstName());
		nameSb.append(" ");
		nameSb.append(getFamilyName());
		return nameSb.toString();
	}

	private String getFamilyName() {
		return nameVo.getFamilyName();
	}

	private String getFirstName() {
		return nameVo.getFirstName();
	}
}
