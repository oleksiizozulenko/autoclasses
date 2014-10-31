package testfr;

import org.apache.log4j.Logger;

public class OurTest {
	
	//Init logging for our test
	Logger log = Logger.getLogger(getClass());

	public void testOurTest() {
		//record some message into log
		log.info("this is my test message");
		log.error("this is my test error");
		log.debug("this is my test debug");
		log.warn("this is my test warn");
		log.trace("this is my test trace");
		log.fatal("fatal message");
	}
}
