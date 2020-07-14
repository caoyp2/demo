package com.test.homework;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesFile {
    public  static  PropertiesConfiguration configuration = null;

    public static void main(String[] args) {
        readProperties("test.properties");
        System.out.println(get("username"));
        setValue("username","zhangsan");
        System.out.println(get("username"));
    }

    public static Configuration readProperties(String path){
        try {
            configuration = new PropertiesConfiguration(path);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        return configuration;
    }

    public static String get(String key){
        return configuration.getString(key);
    }

    public static  void setValue(String key,Object value){
        configuration.setProperty(key,value);
        try {
            configuration.save();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
}
