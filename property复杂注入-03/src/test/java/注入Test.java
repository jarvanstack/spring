import com.bmft.pojo.Student;
import com.bmft.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 注入Test {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    //1. 注入
    @Test
    public void test01() {
        Student test01 = (Student) context.getBean("test01");
        System.out.println(test01);
    }

    /**
     * 拓展
     * c命名和p命名，替代properties和constructor
     * 了解即可，如果代码很多，使用这个会导致空间极其混乱.
     *
     * []建议使用第二个参数，反射。可以不必强转。
     */
    @Test
    public void test02() {
        User test02 = context.getBean("test02", User.class);
        System.out.println(test02);
    }

    @Test
    public void test03() {
        User test03 = context.getBean("test03", User.class);
        System.out.println(test03);
    }
    /**
     * bean的作用域：单例模式和原型模式
     *
     */
    @Test//单例模式
    public void test04(){
        User test04 = context.getBean("test04", User.class);
        User test041 = context.getBean("test04", User.class);
        System.out.println(test04.hashCode());
        System.out.println(test041.hashCode());
        System.out.println(test041==test04);
    }
    @Test//原型模式 每个对象创建一次实例
    public void test05(){
        User test04 = context.getBean("test05", User.class);
        User test041 = context.getBean("test05", User.class);
        System.out.println(test04.hashCode());
        System.out.println(test041.hashCode());
        System.out.println(test041==test04);
    }

}
