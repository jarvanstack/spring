import com.bmft.demo02.UserServiceImpl;
import com.bmft.demo02.UserServiceImplProxy;

/**
 * 增加一个日志功能,不改变原有的的代码
 * 因为改变公司原有的业务代码是公司的大忌，大忌大忌
 */
public class Test02 {
    public static void main(String[] args) {
        UserServiceImplProxy proxy = new UserServiceImplProxy();
        proxy.setUserService(new UserServiceImpl());
        proxy.add();
    }
}
