package week3.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UseValueObjectTest {

	private UseValueObject it;

	@BeforeEach
	void setUp() throws Exception {
		it = new UseValueObject("��", "25");
	}

	@Test
	void testSelfIntroduction() {
		String actual = it.selfIntroduction();
		assertThat(actual, is("���̖��O�́u���v�ł��B�N��́u25�΁v�ł��B"));
	}

}
