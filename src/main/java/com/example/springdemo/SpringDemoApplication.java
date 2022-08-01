package com.example.springdemo;

import com.example.springdemo.dao.PersonDAO;
import com.example.springdemo.entitiy.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

    public Logger logger = LoggerFactory.getLogger(SpringDemoApplication.class);
    @Autowired
    PersonDAO dao;


    public static void main(String[] args) {
//        String [] name = new String[]{"Tony", "John", "Tom"};
//        String [] location = new String[]{"Chinese", "Italian", "Mexican"};
//        List<String> nameList = Arrays.asList(name);
//        List<String> locationList = Arrays.asList(location);
//        List<String> list = new ArrayList<>();
//        Map<String,String> testMap = IntStream.range(0,nameList.size()).boxed().collect(Collectors.toMap(nameList::get,locationList::get));
//        System.out.println(testMap);
//        StringBuilder stringBuilder = new StringBuilder("hello");
//        stringBuilder.append(" world");
//        System.out.println(stringBuilder.toString());

//        String hello = "helle world";
//        hello = true;
        SpringApplication.run(SpringDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("\nAll people's info below -> {}",dao.findAll());
        logger.info("\none person with id = 10001 info below -> {}",dao.findOne(10001));
//        logger.info("\nAll people's info below -> {}",dao.findAll());
//        logger.info("\nAll people's info below -> {}",dao.findAll());

    }




}
