package bmnds.zerocode.sample.complexmodel;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.jupiter.extension.ParallelLoadExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ParallelLoadExtension.class})
@LoadWith("load_test.properties")
public class ComplexModelLoadTest {

	@Test
	@DisplayName("testing parallel load for Mapstruct")
	@TestMapping(testClass = ComplexModelTest.class, testMethod = "testMapstruct")
	void loadTestMapstruct() {
		// this was intentionally left blank
	}

	@Test
	@DisplayName("testing parallel load for ModelMapper")
	@TestMapping(testClass = ComplexModelTest.class, testMethod = "testModelMapper")
	void loadTestModelMapper() {
		// this was intentionally left blank
	}

}
