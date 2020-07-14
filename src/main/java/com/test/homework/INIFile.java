package com.test.homework;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.INIConfiguration;


public class INIFile {
    public static INIConfiguration configuration = null;
    public static void main(String[] args) {
        INIRead("test.ini");
        System.out.println(get("Section1 Name.KeyName1"));

        setValue("Section1 Name.KeyName1","123456");
        System.out.println(get("Section1 Name.KeyName1"));


    }

    public static Configuration INIRead(String path){
        try {
            configuration = new INIConfiguration(path);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        return configuration;
    }

    public static String get(String key){
        return configuration.getString(key);
    }

    public static void setValue(String key, Object value){
        configuration.setProperty(key,value);
        try {
            configuration.save();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
}
