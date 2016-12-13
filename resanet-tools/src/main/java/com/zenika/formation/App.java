package com.zenika.formation;

import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	LOGGER.debug("Before...");
        System.out.println( "Hello World!" );
        LOGGER.debug("After...");
    }
}
