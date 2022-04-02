package week5.answer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NamingAnswerTest {

	private NamingAnswer it;

	@BeforeEach
	void setUp() throws Exception {
		NameVoAnswer nameVo = new NameVoAnswer("Ichiro", "Suzuki");
		it = new NamingAnswer(nameVo);
	}

	@Test
	void testDisplayFirstnameAndFamilyName() {
		String actual = it.displayFirstnameAndFamilyName();
		assertThat(actual, is("Ichiro Suzuki"));
	}
}
