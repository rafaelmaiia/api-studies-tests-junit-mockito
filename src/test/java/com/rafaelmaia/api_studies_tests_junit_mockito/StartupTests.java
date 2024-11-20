package com.rafaelmaia.api_studies_tests_junit_mockito;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StartupTests {

	@Test
	void main() {
		Startup.main(new String[] {});
	}

}
