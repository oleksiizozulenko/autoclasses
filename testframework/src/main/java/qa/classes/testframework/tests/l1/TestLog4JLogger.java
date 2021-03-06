package qa.classes.testframework.tests.l1;

import org.apache.log4j.Logger;

import qa.classes.testframework.ITest;

/**
 * Test case that uses log4j and located in child package
 */
public class TestLog4JLogger implements ITest {
	Logger logger = Logger.getLogger(getClass());

	public void before() {
		logger.info("before l1");

	}

	public int run() {
		logger.info("running l1");
		return 0;
	}

	public void after() {
		logger.info("after l1");

	}
}
