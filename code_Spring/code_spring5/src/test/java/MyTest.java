import com.feng.pojo.UserService;
import com.feng.pojo.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserServiceAnnotation.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
    }
}
