import com.bmft.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test //我们保留事务 -- 异常 -- insert没错但是数据没有提交.
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("service", UserService.class);
        service.test();
    }
    @Test //我们删除事务  异常 -- insert没错 数据正常提交
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("service", UserService.class);
        service.test();
    }
}
