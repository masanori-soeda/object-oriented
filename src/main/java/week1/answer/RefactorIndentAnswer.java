package week1.answer;

/**
 * ���[��1�D1�̃��\�b�h�ɂ��C���f���g��1�i���܂łɂ��邱��
 *
 * HInt : �C���f���g���Ȃ��Ȃ�܂ŁA���t�@�N�^�����O(���\�b�h�̒��o�����邾���ł��B)
 *
 * �����̈��
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
	 * �����Ɏw�肳�ꂽ�s�𐶐����ĕԂ�
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
	 * �s�̈��������ڂɉ����󎚂��邩�����肵�Ԃ��܂�
	 *
	 * @param i
	 * @param j
	 * @return
	 */
	private String getDecidedMark(int i, int j) {
		StringBuilder s = new StringBuilder();
		if (i == j) {
			s.append("��");
		} else {
			s.append("��");
		}
		return s.toString();
	}
}
