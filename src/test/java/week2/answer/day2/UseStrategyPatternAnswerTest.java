package week2.answer.day2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseStrategyPatternAnswerTest {

	private UseStrategyPatternAnswer it;

	@ParameterizedTest(name = "{0}�̏ꍇ�́A({2},{3})�̌v�Z���ʂ�{4}")
	@CsvSource({ "���Z,1,5,1,6", "���Z,2,5,1,4", "�ǂ����ł��Ȃ�,3,5,1,0", })
	void testGetGrade(String name, int type, int a, int b, int expected) {
		it = new UseStrategyPatternAnswer(type);
		int actual = it.calculate(a, b);
		assertThat(actual, is(expected));
	}

}
