import com.ljq.mapper.UserMapper;
import com.ljq.mapper.UserMapperImplljq;
import com.ljq.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class Mytest {
    @Test
    public void testmybatis() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl2 = context.getBean("userMapperImpl2", UserMapper.class);
        for (User user:userMapperImpl2.selectUser()
             ) {
            System.out.println(user);
        }

    }
}
