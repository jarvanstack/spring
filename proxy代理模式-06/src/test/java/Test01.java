import com.bmft.demo01.Host;
import com.bmft.demo01.Proxy;

/**
 * 客人租房
 */
public class Test01 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}



