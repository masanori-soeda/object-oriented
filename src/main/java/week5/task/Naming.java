package week5.task;

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
