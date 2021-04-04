package eg02_传播行为;

import com.jcc.traval.entity.User;
import com.jcc.traval.service.IOutUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TransactionTest {
    @Autowired
    IOutUserService outUserService ;

    @Test
    public void testInsert(){
        User outUser = new User() ;
        outUser.setName("ssm out001");

        try {
            outUserService.insert(outUser) ;
        } catch (Exception e) {
            e.printStackTrace ();
        }


    }
}
