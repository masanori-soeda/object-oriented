package week5.task;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NamingTest {

	private Naming it;

	@BeforeEach
	void setUp() throws Exception {
		NameVo nameVo = new NameVo("Ichiro", "Suzuki");
		it = new Naming(nameVo);
	}

	@Test
	void testDisplayFirstnameAndFamilyName() {
		String actual = it.displayFirstnameAndFamilyName();
		assertThat(actual, is("Ichiro Suzuki"));
	}

}
