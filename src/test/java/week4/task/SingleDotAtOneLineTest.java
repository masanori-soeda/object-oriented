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
		User user = new User("������");
		it = new SingleDotAtOneLine(user);
	}

	@Test
	void testGetPrefCity() {
		String actual = it.getPrefCity();
		assertThat(actual, is("�������͐_�ސ쌧���l�s�ɏZ��ł���"));
	}

}
