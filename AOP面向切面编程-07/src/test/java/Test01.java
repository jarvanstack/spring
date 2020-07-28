import com.bmft.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用Spring API 功能最多的 方法
 */
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //这里使interface就可以，之前实现类已经在beans.mxl中配置过了
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();
    }
}
