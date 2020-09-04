import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.People;
import pojo.User;

public class mytest {
    @Test
    public void testauto(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People ljq = context.getBean("people", People.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
        ljq.getCat().shout();
        ljq.getDog().shout();
    }
}
