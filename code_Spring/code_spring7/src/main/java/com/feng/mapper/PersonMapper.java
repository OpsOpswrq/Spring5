package com.feng.mapper;

import com.feng.pojo.Person;

import java.util.List;
import java.util.Map;

public interface PersonMapper {
    List<Person> selectPerson();
    void insertPerson(Person person);
    void deletePerson(int id);
}
