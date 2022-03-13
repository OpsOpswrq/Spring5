import com.feng.mapper.PersonMapper;
import com.feng.mapper.PersonMapperImpl;
import com.feng.pojo.Person;
import com.feng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Springxml/Spring.xml");
        PersonMapper people = context.getBean("people", PersonMapper.class);
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("name","feng");
        stringObjectHashMap.put("id",1);
        people.updatePerson(stringObjectHashMap);

    }
}


