import com.bmft.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Auto装配Test {

    @Test//测试手动转配
    public void test01(){
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context1.getBean("person", Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }

    @Test//展示byName自动
    public void test02(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context2.getBean("person", Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }

    @Test//展示byName自动
    public void test03(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context2.getBean("person", Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }
    /**
     * ==================================使用注解实现自动转配（重要）种方法
     *  1. @Autowired 自动装配 类型 ，名字
     *     如果@Autowired 不能实现你的需求可以使用 @Qualifier(value="XXX")指定
     *  2. @Resources 自动装配，名字--类型
     *      如果很复杂的可以使用 @Resources(name="XXX")指定
     *
     */
    @Test//展示
    public void test04(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context2.getBean("person", Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }
}
