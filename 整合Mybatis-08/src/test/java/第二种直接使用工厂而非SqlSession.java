import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class 第二种直接使用工厂而非SqlSession {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl02 = context.getBean("userMapperImpl02", UserMapper.class);
        List<User> users = userMapperImpl02.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
