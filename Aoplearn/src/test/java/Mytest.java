import com.ljq.service.UserService;
import com.ljq.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void testaop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();
        userService.delete();

    }
}
