package week5.answer;

/**
 * ���[��5�D���O���ȗ����Ȃ�����
 *
 * HINT1:���O�̗v�f�������̂�2�ɕ����܂�
 *
 * HINT2: ���̃��\�b�h�͖��O��ς��ē��������킷���̂ɕς��܂��傤
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
