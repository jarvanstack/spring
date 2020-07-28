import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试环境mybatis原生环境 === 成功
 *
 */
public class TestEnvouriment01 {
    public static void main(String[] args) throws IOException {
        //模拟工具类获取SQLSession
        String resourcesPath = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resourcesPath);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
