package week1.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefactorIndentAnswerTest {

	private RefactorIndentAnswer it;

	@BeforeEach
	void setUp() throws Exception {
		it = new RefactorIndentAnswer();
	}

	@Test
	void testMethod1() {
		String actual = it.method1();
		assertThat(actual, is(getExpected()));
	}

	private String getExpected() {
		StringBuffer expectedSb = new StringBuffer();
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		expectedSb.append("��������������������").append("\r\n");
		return expectedSb.toString();

	}

}
