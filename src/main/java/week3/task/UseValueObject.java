package week3.task;

/**
 * ���[��3�D���ׂẴv���~�e�B�u�^�ƕ�����^�����b�v���邱��
 *
 * ���̏�Ԃ̏ꍇ�A���O�ƔN����t�ɂ��Ă��R���X�g���N�^�ł̓R���p�C���G���[�ɂȂ�Ȃ����߁A���s����܂Ńo�O�ɋC�t���܂���B
 *
 * Hint�P�F�t�B�[���h�ϐ���l�I�u�W�F�N�g�Ő錾���Ȃ����܂��B
 *
 * Hint�Q�F�e�l�I�u�W�F�N�g�ł́A���e�������ȊO�𗘗p�����Ȃ��悤�Ȑ��䃍�W�b�N�����܂��B
 *
 * Hint�R�Fname��null�͕s�B
 *
 * Hint�S�Fage�͐����ȊO�A�}�C�i�X�̒l�A�͋����Ȃ��B
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
		sb.append("���̖��O�́u");
		sb.append(this.name);
		sb.append("�v�ł��B�N��́u");
		sb.append(this.age);
		sb.append("�΁v�ł��B");

		return sb.toString();
	}
}
