import com.feng.Mapper.Cat;
import com.feng.Mapper.Dog;
import com.feng.Mapper.People;

import com.feng.Mapper.User1;
import com.feng.config.UserConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("PeopleBeans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().Howl();
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        User1 user = context.getBean("user", User1.class);
        User1 user1 = context.getBean("user", User1.class);
        System.out.println(user1==user);
    }
    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User1 user = context.getBean("user1", User1.class);
        System.out.println(user);
    }
}
