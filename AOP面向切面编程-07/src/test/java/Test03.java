

import com.bmft.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解实现自定义，和test02类似，但是也十分方便。
 */
public class Test03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //这里使interface就可以，之前实现类已经在beans.mxl中配置过了
        UserService userService = context.getBean("test03", UserService.class);
        userService.delete();
    }
}
