package bmnds.zerocode.sample.simplemodel;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.jupiter.extension.ParallelLoadExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ParallelLoadExtension.class})
@LoadWith("load_test.properties")
public class SimpleModelLoadTest {

	@Test
	@DisplayName("testing parallel load for BeanUtils")
	@TestMapping(testClass = SimpleModelTest.class, testMethod = "testBeanUtils")
	void loadTestBeanUtils() {
		// this was intentionally left blank
	}

	@Test
	@DisplayName("testing parallel load for Mapstruct")
	@TestMapping(testClass = SimpleModelTest.class, testMethod = "testMapstruct")
	void loadTestMapstruct() {
		// this was intentionally left blank
	}

	@Test
	@DisplayName("testing parallel load for ModelMapper")
	@TestMapping(testClass = SimpleModelTest.class, testMethod = "testModelMapper")
	void loadTestModelMapper() {
		// this was intentionally left blank
	}

}
