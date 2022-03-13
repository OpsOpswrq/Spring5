import com.feng.mapper.PersonMapper;
import com.feng.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Springxml/Spring.xml");
        PersonMapper people = context.getBean("people", PersonMapper.class);
        people.selectPerson();

    }
}
