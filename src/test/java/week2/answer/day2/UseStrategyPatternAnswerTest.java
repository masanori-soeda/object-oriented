package week2.answer.day2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseStrategyPatternAnswerTest {

	private UseStrategyPatternAnswer it;

	@ParameterizedTest(name = "{0}‚Ìê‡‚ÍA({2},{3})‚ÌŒvZŒ‹‰Ê‚Í{4}")
	@CsvSource({ "‰ÁZ,1,5,1,6", "ˆøZ,2,5,1,4", "‚Ç‚Á‚¿‚Å‚à‚È‚¢,3,5,1,0", })
	void testGetGrade(String name, int type, int a, int b, int expected) {
		it = new UseStrategyPatternAnswer(type);
		int actual = it.calculate(a, b);
		assertThat(actual, is(expected));
	}

}
