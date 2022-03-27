package week3.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import week3.answer.vo.AgeVo;
import week3.answer.vo.NameVo;

public class UseValueObjectAnswerTest {

	private UseValueObjectAnswer it;

	@Test
	void testSelfIntroduction() throws ParseException {
		it = new UseValueObjectAnswer(NameVo.is("��"), AgeVo.is("25"));
		String actual = it.selfIntroduction();
		assertThat(actual, is("���̖��O�́u���v�ł��B�N��́u25�΁v�ł��B"));
	}

	@Test
	void testSelfIntroduction_NameError() throws ParseException {
		assertThrows(IllegalArgumentException.class, () -> {
			it = new UseValueObjectAnswer(NameVo.is(null), AgeVo.is("25"));
			it.selfIntroduction();
		});
	}

	@Test
	void testSelfIntroduction_AgeError_not_Number() throws ParseException {
		assertThrows(ParseException.class, () -> {
			it = new UseValueObjectAnswer(NameVo.is("��"), AgeVo.is("ABC"));
			it.selfIntroduction();
		});
	}

	@Test
	void testSelfIntroduction_AgeError_not_Plus() throws ParseException {
		assertThrows(IllegalArgumentException.class, () -> {
			it = new UseValueObjectAnswer(NameVo.is("��"), AgeVo.is("-10"));
			it.selfIntroduction();
		});
	}

}
