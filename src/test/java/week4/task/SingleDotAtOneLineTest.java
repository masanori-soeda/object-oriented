package week4.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week4.task.vo.User;

public class SingleDotAtOneLineTest {

	private SingleDotAtOneLine it;

	@BeforeEach
	void setUp() throws Exception {
		User user = new User("たけし");
		it = new SingleDotAtOneLine(user);
	}

	@Test
	void testGetPrefCity() {
		String actual = it.getPrefCity();
		assertThat(actual, is("たけしは神奈川県横浜市に住んでいる"));
	}

}
