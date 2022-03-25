package week2.day2.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseStrategyPatternTest {

	private UseStrategyPattern it;

	@ParameterizedTest(name = "{0}�̏ꍇ�́A({2},{3})�̌v�Z���ʂ�{4}")
	@CsvSource({ "���Z,1,5,1,6", "���Z,2,5,1,4", "�ǂ����ł��Ȃ�,3,5,1,0", })
	void testGetGrade(String name, int type, int a, int b, int expected) {
		it = new UseStrategyPattern(type);
		int actual = it.calculate(a, b);
		assertThat(actual, is(expected));
	}
}
