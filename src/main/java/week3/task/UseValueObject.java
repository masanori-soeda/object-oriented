package week3.task;

/**
 * ルール3．すべてのプリミティブ型と文字列型をラップすること
 *
 * 今の状態の場合、名前と年齢を逆にしてもコンストラクタではコンパイルエラーにならないため、実行するまでバグに気付けません。
 *
 * Hint１：フィールド変数を値オブジェクトで宣言しなおします。
 *
 * Hint２：各値オブジェクトでは、許容される情報以外を利用させないような制御ロジックを入れます。
 *
 * Hint３：nameはnullは不可。
 *
 * Hint４：ageは数字以外、マイナスの値、は許可しない。
 *
 *
 * @author soepy
 *
 */
public class UseValueObject {

	private String name;
	private String age;

	public UseValueObject(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String selfIntroduction() {
		StringBuffer sb = new StringBuffer();
		sb.append("私の名前は「");
		sb.append(this.name);
		sb.append("」です。年齢は「");
		sb.append(this.age);
		sb.append("歳」です。");

		return sb.toString();
	}
}
