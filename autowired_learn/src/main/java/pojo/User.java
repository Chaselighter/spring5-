package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="pojo"/>
@Component
public class User {
    @Value("刘建松")
    public String name ="刘建强";
}
