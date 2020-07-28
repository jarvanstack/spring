import com.bmft.dao.UserDao;
import com.bmft.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //解析beans.xml文件 ，生成管理响应的bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.getName());

    }

    /**
     * test2就是优化IOC原理-01，中的问题，使用 spring解决
     */
    @Test
    public void test02(){
        //解析beans.xml文件 ，生成管理响应的bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao mysql = (UserDao)context.getBean("mysql");
        mysql.getUser();
        UserDao Oracle = (UserDao) context.getBean("oracle");
        Oracle.getUser();
        UserDao mysql2 = (UserDao)context.getBean("mysql");
        System.out.println("============ "+(mysql==mysql2));
    }

    /**
     * 这个是有参构造测试，
     */
    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello2 = (Hello)context.getBean("hello2");
        System.out.println(hello2.getName());
    }

    /**
     * 这个是配置测试
     * 1. alias取别名
     */
    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello aliasHello = (Hello)context.getBean("aliasHello");
        System.out.println(aliasHello);
    }
    /**
     * 2. bean 的配置
     * id：是调用的标识符，alias别名也可以调用，
     * name: 别名可以多个，用空格，逗号，分号...隔开
     *
     * (   id 是bean的标识符,要唯一,如果没有配置id,name就是默认标识符
     *    如果配置id,又配置了name,那么name是别名
     *    name可以设置多个别名,可以用逗号,分号,空格隔开
     *    如果不配置id和name,可以根据applicationContext.getBean(.class)获取对象;
     *
     * class是bean的全限定名=包名+类名)
     */
    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello config_bean1  = (Hello)context.getBean("config_bean1");
        System.out.println(config_bean1);
    }
    /**
     * import 团队合作，用于导入bean，可导入多个
     */
    @Test
    public void test06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello config_bean1 = (Hello)context.getBean("config_bean1");
        System.out.println(config_bean1);
    }
}
