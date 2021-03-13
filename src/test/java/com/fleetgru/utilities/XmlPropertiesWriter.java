package com.fleetgru.utilities;

import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.util.Properties;

/**
 * Java program to store properties in XML property file. stroeToXML() method of
 * java.util.Properties class is used to save properties in XML property file from Java
 * program.
 *
 * @author Javin Paul
 */
public class XmlPropertiesWriter {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //Reading properties files in Java example
        Properties props = new Properties();
        FileOutputStream fos = new FileOutputStream("c:/user.xml");

        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");

        //writing properites into properties file from Java
        props.storeToXML(fos, "Properties file in xml format generated from Java program");



        fos.close();


    }
}


//    Read more: https://javarevisited.blogspot.com/2012/12/how-to-create-and-modify-properties.html#ixzz6owtNJKmD