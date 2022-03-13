package com.feng.mapper;

import com.feng.pojo.Person;

import java.util.List;
import java.util.Map;

public interface PersonMapper {
    List<Person> selectPerson();
    void updatePerson(Map map);
}
