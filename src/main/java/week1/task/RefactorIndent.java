package week1.task;

/**
 * ���[��1�D1�̃��\�b�h�ɂ��C���f���g��1�i���܂łɂ��邱��
 *
 * HInt : �C���f���g���Ȃ��Ȃ�܂ŁA���t�@�N�^�����O(���\�b�h�̒��o�����邾���ł��B)
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
					s.append("��");
				} else {
					s.append("��");
				}
			}
			s.append("\r\n");
		}
		return s.toString();
	}
}
