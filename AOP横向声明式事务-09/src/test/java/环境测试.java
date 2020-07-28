import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 *  环境 OK
 */
public class 环境测试 {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void select(){
        User user = new User(10, "王二", "fdsafas");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectUsers();
        for (User user1 : users) {
            System.out.println(user1);
        }
    }
    @Test //insert
    public void update(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id","2");
        map.put("name","地方撒");
        map.put("password","fdsaf");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        userMapperImpl.updateUser(map);
    }

    @Test //delete
    public void delete(){
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        userMapperImpl.deleteUserById(10);
    }

    @Test //update
    public void insert(){
        User user = new User(10, "范德萨发", "dfsaf");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        System.out.println(userMapperImpl.insertUser(user));
    }

}
