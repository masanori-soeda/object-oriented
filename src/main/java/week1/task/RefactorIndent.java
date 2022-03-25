package week1.task;

/**
 * ルール1．1つのメソッドにつきインデントは1段落までにすること
 *
 * HInt : インデントがなくなるまで、リファクタリング(メソッドの抽出をするだけです。)
 *
 * @author soepy
 *
 */
public class RefactorIndent {

	public String method1() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					s.append("■");
				} else {
					s.append("●");
				}
			}
			s.append("\r\n");
		}
		return s.toString();
	}
}
