import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
