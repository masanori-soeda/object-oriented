package week2.day2.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UseStrategyPatternTest {

	private UseStrategyPattern it;

	@ParameterizedTest(name = "{0}‚Ìê‡‚ÍA({2},{3})‚ÌŒvZŒ‹‰Ê‚Í{4}")
	@CsvSource({ "‰ÁZ,1,5,1,6", "ˆøZ,2,5,1,4", "‚Ç‚Á‚¿‚Å‚à‚È‚¢,3,5,1,0", })
	void testGetGrade(String name, int type, int a, int b, int expected) {
		it = new UseStrategyPattern(type);
		int actual = it.calculate(a, b);
		assertThat(actual, is(expected));
	}
}
