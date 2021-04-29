package task01;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggeredFile {

	private static Logger LOG = Logger.getLogger(CustomLoggeredFile.class);

	public static void main(String[] args) {

		System.out.println("HOW WORK LOGGERS?");
		System.out.println("\n");
		System.out.println("************************************************************");

		DOMConfigurator.configure("loggerConfig.xml");
		try {
			System.out.println("Try Message");
			LOG.debug("Start");
			LOG.warn("Try block almost done, error is possible in next line");
			int i = 2 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e.getMessage().toString());
		} finally {
			System.out.println("Finally Message");
			LOG.info("The end");
		}
	}
}