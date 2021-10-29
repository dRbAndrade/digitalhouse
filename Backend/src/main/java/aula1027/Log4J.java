package main.java.aula1027;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4J {

    private static final Logger logger = Logger.getLogger(Log4J.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("Backend\\log4j.properties");
        logger.info("Testando logger");
    }

}
