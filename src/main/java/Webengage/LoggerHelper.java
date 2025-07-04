
package Webengage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Webengage.Initialize.Initialize;

public class LoggerHelper  extends Initialize{
	
	
	
    public static Logger getLogger(Class<?> cls) {
        return LogManager.getLogger(cls);
    }
    
}
