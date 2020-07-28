

import com.bmft.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义类来完成AOPTest02
 */
public class Test02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //这里使interface就可以，之前实现类已经在beans.mxl中配置过了
        UserService userService = context.getBean("test02", UserService.class);
        userService.delete();
    }
}
