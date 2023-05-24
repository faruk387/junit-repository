package com.myfirstproject;

import com.myfirstproject.utilities.LoggerUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_Log4J2 {
    private static Logger logger= LogManager.getLogger(Day15_Log4J2.class.getName());

    @Test
    public void loggerTest(){
        logger.fatal("Fatal log...........");
        logger.error("Error log...........");
        logger.warn("Warning log..........");//NOT YET. NOW AFTER log42j.xml WE SEE THIS LEVEL
        logger.debug("Debug log............");//NOT YET. NOW AFTER log42j.xml WE SEE THIS LEVEL
        logger.info("Info log...............");//NOT YET. NOW AFTER log42j.xml WE SEE THIS LEVEL

    }
    @Test
    public void loggerTest2(){
        LoggerUtils.debug("Debug log");
        LoggerUtils.warn("Warn log");
        LoggerUtils.info("Info log");
        LoggerUtils.error("Error log");
        LoggerUtils.fatal("Fatal log");
    }

}
