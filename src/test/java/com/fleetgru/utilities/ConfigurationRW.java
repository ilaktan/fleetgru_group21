package com.fleetgru.utilities;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationRW {
    public static void main(String[] args) throws IOException {
        ConfigurationRW.printConfiguration();
        System.out.println(ConfigurationRW.isKey_Check("driver_password"));
        ConfigurationRW.insert("driver_password","User");
        ConfigurationRW.insert("browser","chrome");
    }

    private static Properties properties;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }
    public static void printConfiguration(){
        Set<String> keys=properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key+" :"+properties.get(key));
        }
    }
    public static boolean isKey_Check(String key){
        Set<String> keys=properties.stringPropertyNames();

        return keys.contains(key);
    }
    public static void insert(String key,String value) throws IOException {
        FileWriter fileWriter=new FileWriter("configuration.properties",true);
        Properties p=new Properties();
        if(!ConfigurationRW.isKey_Check(key)) {
            p.setProperty(key, value);
        }else if(ConfigurationRW.isKey_Check(key)) {
            System.out.println(key + " is in the configuration.properties already");
        }
        p.store(fileWriter,null);
    }
    public static void insert(String fileName,String key,String value) throws IOException {
        FileWriter fileWriter=new FileWriter(fileName,true);
        Properties p=new Properties();
        if(!ConfigurationRW.isKey_Check(key)) {
            p.setProperty(key, value);
        }else if(ConfigurationRW.isKey_Check(key)) {
            System.out.println(key + " is in the configuration.properties already");
        }        p.store(fileWriter,null);
    }

}