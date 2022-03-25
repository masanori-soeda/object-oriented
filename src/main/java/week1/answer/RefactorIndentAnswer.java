package week1.answer;

/**
 * ルール1．1つのメソッドにつきインデントは1段落までにすること
 *
 * HInt : インデントがなくなるまで、リファクタリング(メソッドの抽出をするだけです。)
 *
 * 正解の一例
 *
 * @author soepy
 *
 */
public class RefactorIndentAnswer {

	public String method1() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			s.append(appendLine(i));
			s.append("\r\n");
		}
		return s.toString();
	}

	/**
	 * 引数に指定された行を生成して返す
	 *
	 * @param i
	 * @return
	 */
	private String appendLine(int i) {
		StringBuilder s = new StringBuilder();
		for (int j = 0; j < 10; j++) {
			s.append(getDecidedMark(i, j));
		}
		return s.toString();
	}

	/**
	 * 行の引数文字目に何を印字するかを決定し返します
	 *
	 * @param i
	 * @param j
	 * @return
	 */
	private String getDecidedMark(int i, int j) {
		StringBuilder s = new StringBuilder();
		if (i == j) {
			s.append("■");
		} else {
			s.append("●");
		}
		return s.toString();
	}
}
