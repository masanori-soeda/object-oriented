package week1.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefactorIndentTest {

	private RefactorIndent it;

	@BeforeEach
	void setUp() throws Exception {
		it = new RefactorIndent();
	}

	@Test
	void testMethod1() {
		String actual = it.method1();
		assertThat(actual, is(getExpected()));
	}

	private String getExpected() {
		StringBuffer expectedSb = new StringBuffer();
		expectedSb.append("¡œœœœœœœœœ").append("\r\n");
		expectedSb.append("œ¡œœœœœœœœ").append("\r\n");
		expectedSb.append("œœ¡œœœœœœœ").append("\r\n");
		expectedSb.append("œœœ¡œœœœœœ").append("\r\n");
		expectedSb.append("œœœœ¡œœœœœ").append("\r\n");
		expectedSb.append("œœœœœ¡œœœœ").append("\r\n");
		expectedSb.append("œœœœœœ¡œœœ").append("\r\n");
		expectedSb.append("œœœœœœœ¡œœ").append("\r\n");
		expectedSb.append("œœœœœœœœ¡œ").append("\r\n");
		expectedSb.append("œœœœœœœœœ¡").append("\r\n");
		return expectedSb.toString();

	}

}
