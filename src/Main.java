import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.log(Level.ERROR, "Fake error!");
		AnotherClass ac = new AnotherClass();
		ac.testMethod();
		logger.trace("A TRACE event");
		logger.info("Another fake INFO event");
	}

}
