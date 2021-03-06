package week2.day2.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseStrategyPatternAnswerTest {

	private UseStrategyPatternAnswer it;

	@ParameterizedTest(name = "{0}の場合は、({2},{3})の計算結果は{4}")
	@CsvSource({ "加算,1,5,1,6", "引算,2,5,1,4", "どっちでもない,3,5,1,0", })
	void testGetGrade(String name, int type, int a, int b, int expected) {
		it = new UseStrategyPatternAnswer(type);
		int actual = it.calculate(a, b);
		assertThat(actual, is(expected));
	}

}
