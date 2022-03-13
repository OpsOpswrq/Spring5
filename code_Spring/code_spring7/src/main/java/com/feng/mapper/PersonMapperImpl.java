package com.feng.mapper;

import com.feng.pojo.Person;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class PersonMapperImpl implements PersonMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Person> selectPerson() {
        insertPerson(new Person(8,"deng","4396"));
        deletePerson(6);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> people = mapper.selectPerson();
        return people;
    }

    @Override
    public void insertPerson(Person person) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.insertPerson(person);
    }

    @Override
    public void deletePerson(int id) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.deletePerson(id);
    }
}
