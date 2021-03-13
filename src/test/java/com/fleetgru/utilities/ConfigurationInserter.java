package com.fleetgru.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//this class still permits to write the same things second time
//this should be fixed but for now more than enough for me.
public class ConfigurationInserter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("try.properties",true);
        Properties p=new Properties();
        p.setProperty("name","value");
        p.setProperty("ee","bu mu");
        p.store(fileWriter,null);
        System.out.println(p.stringPropertyNames().toString());
        //File file=new File();
    }
    public void insertProperties(String key,String value) throws IOException {
        FileWriter fileWriter=new FileWriter("try.properties",true);
        Properties p=new Properties();
        p.setProperty("name","value");
        p.setProperty("ee","bu mu");
        p.store(fileWriter,null);
    }
    public void insertProperties(String fileName,String key,String value) throws IOException {
        FileWriter fileWriter=new FileWriter(fileName,true);
        Properties p=new Properties();
        p.setProperty(key,value);
        p.store(fileWriter,null);
    }
}
