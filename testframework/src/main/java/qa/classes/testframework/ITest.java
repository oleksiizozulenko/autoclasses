package qa.classes.testframework;

/**
 * Interface for all our tests. 
 * This interface give structure for any test
 */
public interface ITest {
	  public static final int EXIT_SUCCESS = 0;
	  public static final int EXIT_FAILURE = 1;
	  
	  public void before();
	  public int run();
	  public void after();
}
