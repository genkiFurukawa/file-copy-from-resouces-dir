package com.example.demo;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // resources配下のファイルをコピーする
        URL srcUrl;
        try {
            srcUrl = ClassLoader.getSystemResource("test.txt");
            FileUtils.copyURLToFile(srcUrl, new File("/Users/genki/Documents/hoge.txt"));

            srcUrl = ClassLoader.getSystemResource("test/test.txt");
            FileUtils.copyURLToFile(srcUrl, new File("/Users/genki/Documents/fuga.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        SpringApplication.run(DemoApplication.class, args);
    }

}
