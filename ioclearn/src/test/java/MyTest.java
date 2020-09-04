import com.ljq.dao.UserDao;
import com.ljq.dao.UserDaoImpl;
import com.ljq.dao.UserDaoMysqlImpl;
import com.ljq.dao.UserDaoRedisImpl;
import com.ljq.service.UserService;
import com.ljq.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PrivateKey;


public class MyTest {
    @Test
    public void beantest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser(1,1);
    }
}
