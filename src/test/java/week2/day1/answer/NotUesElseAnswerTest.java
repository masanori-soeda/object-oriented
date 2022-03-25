package week2.day1.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NotUesElseAnswerTest {

	private NotUesElseAnswer it;

	@BeforeEach
	void setUp() throws Exception {
		it = new NotUesElseAnswer();
	}

	@ParameterizedTest(name = "得点：{0}は、Grade：{1}")
	@CsvSource({ "100,A", "90,A", "80,B", "70,B", "60,C", "50,C", })
	void testGetGrade(int score, String expected) {
		String actual = it.getGrade(score);
		assertThat(actual, is(expected));
	}

}
