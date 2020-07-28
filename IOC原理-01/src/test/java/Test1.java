import dao.UserDaoOrancleImpl;
import org.junit.Test;
import service.UserService;
import service.UserServiceImpl;

/**
 * UserDao 有 3个实现类，
 * 如果我们要使用其中的一个就需要到
 * 对应的Service层去改，器构造方法的到层的确定的 实现，
 *     private UserDao userDao = new UserDaoImpl();//注意这里
 *  有没有其他的可以方便解决的办法呢，？
 *  我们可以定义一个set方法，在使用的时候给对应的new UserDaoImpl()
 *  set其他的值，比如
 *  public void setUserDao(UserDao userDaoImpl){
 *         userDao = userDaoImpl;
 *     }
 *   我们使用的方法如test01 所示
 *
 *   解耦了
 *
 *
 */
public class Test1 {
    @Test
    public void test01(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoOrancleImpl());
        userService.getUser();
    }
}
