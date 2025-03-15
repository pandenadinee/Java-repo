package com.collectionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProtertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        FileInputStream input = new FileInputStream("src/com/collectionPractice/config.properties");
        p.load(input);

        String name = p.getProperty("username");
        System.out.println(name);

        String pass = p.getProperty("password");
        System.out.println(pass);

        String roll = p.getProperty("rollId");
        System.out.println(roll);

        String sname = p.getProperty("sername","pandey");
        System.out.println(sname);

        FileOutputStream output = new FileOutputStream("src/com/collectionPractice/config.properties");
        p.setProperty("age","25");
        
        p.store(output,"my age is");

    }
}
