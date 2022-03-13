import com.feng.Mapper.Host;
import com.feng.Mapper.Rent;
import com.feng.Utils.Proxy1;
import org.junit.Test;

public class MyTest {
    @Test
    public void test1(){
        Host host = new Host();
        Proxy1 proxy1 = new Proxy1(host);
        Rent proxy = (Rent) proxy1.getProxy();
        proxy.rent();
    }
}
