import com.jcc.travel.dao.IContractDao;
import com.jcc.travel.vo.ContractVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

@ContextConfiguration("classpath:spring.xml")
public class TestMybatis {
    public static void main(String[] args) {
        try {
            //s1.读取配置文件
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder() ;
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            IContractDao iContractDao = sqlSession.getMapper ( IContractDao.class);
            ContractVo contractVo=new ContractVo ();
            contractVo.setBasId ( 6);
            contractVo.setBasName ( "1" );
            contractVo.setDate (new Date ( 2019,7,7 ) );
            contractVo.setMoney ( new BigDecimal ( "100" ) );
            iContractDao.create (contractVo  );
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
