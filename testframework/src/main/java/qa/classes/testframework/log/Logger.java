package qa.classes.testframework.log;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Logger {
	PrintWriter writer;
	static Logger log;
	
	
	public static Logger getLogger(String outdir){
		if (log == null) return new Logger(outdir);
		return log;
	}
	protected Logger(String outdir)
	{
		 try {
			writer = new PrintWriter(outdir + "test.log", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void finalize ()  {
		writer.close();
        }
	
	
	public void error(String error){
		String errorMsg = "[ERROR] " + error;
		System.out.println(errorMsg);
		writer.println(errorMsg);
		writer.flush();
	}
	public void info(String info) {
		String errorMsg = "[INFO] " + info;
		System.out.println(errorMsg);
		writer.println(errorMsg);
		writer.flush();
	}
	
}
