package week4.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week4.answer.vo.UserAnswer;

public class SingleDotAtOneLineAnswerTest {

	private SingleDotAtOneLineAnswer it;

	@BeforeEach
	void setUp() throws Exception {
		UserAnswer user = new UserAnswer("ÇΩÇØÇµ");
		it = new SingleDotAtOneLineAnswer(user);
	}

	@Test
	void testGetPrefCity() {
		String actual = it.getPrefCity();
		assertThat(actual, is("ÇΩÇØÇµÇÕê_ìﬁêÏåßâ°ïlésÇ…èZÇÒÇ≈Ç¢ÇÈ"));
	}

}
