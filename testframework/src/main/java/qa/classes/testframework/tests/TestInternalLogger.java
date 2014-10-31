package qa.classes.testframework.tests;

import qa.classes.testframework.ITest;
import qa.classes.testframework.log.Logger;

/**
 * Test case that uses self developed logger
 */
public class TestInternalLogger implements ITest {
	Logger log = Logger.getLogger("C:\\temp\\");

	public void before() {
		log.info("before");
	}

	public int run() {
		log.info("running");
		return 0;
	}

	public void after() {
		log.info("after");

	}
}
