import com.bmft.config.MyBeanConfig;
import com.bmft.controller.Controller01;
import com.bmft.dao.Dao01;
import com.bmft.pojo.User;
import com.bmft.service.Service01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 注解开发Test {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    @Test//使用@Value注解可以直接给字段赋值
    public void test02(){
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    /**
     * 我们提供三个衍生的注解相当于Component
     * * @Controller 在控制层（Servlet别称）使用
     * * @Service 在service层使用
     * * @Repository 仓库在DAO层使用。
     */
    @Test
    public void test03(){
        //测试controller 层的
        Controller01 controller01 = context.getBean("controller01", Controller01.class);
        System.out.println(controller01);
        Dao01 dao01 = context.getBean("dao01", Dao01.class);
        System.out.println(dao01);
        Service01 service01 = context.getBean("service01", Service01.class);
        System.out.println(service01);
    }
    /**
     * @Scope 作用域
     * 比如 @Scope("prototype")
     *       public class User {
     *       将user 的作用域设置为 原型模式
     * System.out.println(user==user2); //false
     */
    @Test
    public void test05(){
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user==user2);
    }
    /**
     * 1.和xml注解的比较
     * * xml适合任何场景，十分的万能
     * * 注解不是自己的 类使用不了，但是开发十分简单
     * 2.推荐的使用方法
     * * xml管理bean，和复杂的属性注入
     * * 注解完成简单的属性注入
     *
     */

    //===========新特性java 代替bean.xml ==========
    @Test
    public  void test06(){
        //注意这里获取context 的对象的不同和加载的方式不同
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        System.out.println(context.getBean("user"));
        /**
         * 同样的我们在配置类中使用
         * @import 注解实现导入
         * 和其他标签实现bean.xml 能实现的功能，自己探索，使用时候再看。
         */
    }

}
