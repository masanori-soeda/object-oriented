package week5.task;

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
public class Naming {

	private NameVo nameVo;

	public Naming(NameVo nameVo) {
		this.nameVo = nameVo;
	}

	public String displayFirstnameAndFamilyName() {
		StringBuffer nameSb = new StringBuffer();
		nameSb.append(nameVo.getFirstName());
		nameSb.append(" ");
		nameSb.append(nameVo.getFamilyName());
		return nameSb.toString();
	}
}
