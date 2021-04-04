import com.jcc.traval.dao.IUserDao;
import com.jcc.traval.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;
import java.io.InputStream;

@ContextConfiguration("classpath:spring.xml")
public class MyBatisTest {
    public static void main(String[] args) {
        try {
            //s1.读取配置文件
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder() ;
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            IUserDao userDao = sqlSession.getMapper(IUserDao.class);


            User user = new User() ;
            user.setName("ssm011111");
            userDao.insert(user) ;
            sqlSession.commit();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
