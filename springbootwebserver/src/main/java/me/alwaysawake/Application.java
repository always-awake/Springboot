package me.alwaysawake;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;

import java.io.File;

public class Application {

    public static void main(String[] args) {
        Tomcat tomcat = new = Tomcat();
        tomcat.setPort(8080);

//        tomcat.addContext("/", new File())
    }

}
