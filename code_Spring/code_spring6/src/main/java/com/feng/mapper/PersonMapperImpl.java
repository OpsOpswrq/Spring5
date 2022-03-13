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
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> people = mapper.selectPerson();
        return people;
    }

    @Override
    public void updatePerson(Map map) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.updatePerson(map);
    }
}
