package qa.classes.testframework;

public interface ITest {
	  public static final int EXIT_SUCCESS = 0;
	  public static final int EXIT_FAILURE = 1;
	  
	  public void before();
	  public int run();
	  public void after();
}
