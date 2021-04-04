package eg01_事务基本;

import com.jcc.traval.entity.User;
import com.jcc.traval.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TransactionTest {
    @Autowired
    IUserService userService ;

    @Test
    public void testInsert(){
        User user = new User() ;
        user.setName("ssm0002224");
        try {
            userService.insert(user) ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
