package com.example.springdemo.dao;

import com.example.springdemo.entitiy.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findOne(int id) {
//        return jdbcTemplate.queryForObject("select * from person where id=?",new BeanPropertyRowMapper<>(Person.class),new Object[]{id});
        return jdbcTemplate.queryForObject("select * from person where id=?",new BeanPropertyRowMapper<>(Person.class),id);
    }

    public int deleteById(int id){
//        return jdbcTemplate.querydelete("select *")
        return id;
    }
}
