package oata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static Logger logger =LogManager.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        
        // ConfigurationFactory.newConfigurationBuilder().build();
        logger.info("Hello World");     
    }

}