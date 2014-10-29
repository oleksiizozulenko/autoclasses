package qa.classes.testframework;

import java.util.HashSet;
import java.util.Set;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

/**
 * Hello world!
 *
 */
public class TestsRunner {

	public static void main(String[] args) {

		final Set<Class<? extends ITest>> classes = new HashSet<Class<? extends ITest>>();

		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {
			@Override
			protected void query() {
				select().from("qa.classes.testframework.tests",
						"qa.classes.testframework.tests.*").andStore(
						thoseImplementing(ITest.class).into(classes));
			}
		});

		for (Class test : classes) {
			try {
				ITest execute = (ITest) test.newInstance();

				execute.before();
				execute.run();
				execute.after();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
