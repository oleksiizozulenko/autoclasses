package qa.classes.testframework;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

/**
 * Runner for tests
 */
public class TestsRunner {
	private static Logger log = Logger.getLogger(TestsRunner.class);

	public static void main(String[] args) {

		final Set<Class<? extends ITest>> classes = new HashSet<Class<? extends ITest>>();

		// Select all tests from package qa.classes.testframework.tests and his
		// children
		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {
			@Override
			protected void query() {
				select().from("qa.classes.testframework.tests",
						"qa.classes.testframework.tests.*").andStore(
						thoseImplementing(ITest.class).into(classes));
			}
		});

		// now time to execute every test case sequentially
		log.info("Stating executing test cases");
		for (Class<? extends ITest> test : classes) {
			try {
				ITest execute = (ITest) test.newInstance();

				execute.before();
				execute.run();
				execute.after();
			} catch (InstantiationException e) {
				log.error(e);
			} catch (IllegalAccessException e) {
				log.error(e);
			}
		}
		log.info("Test cases execution finished");

	}
}
