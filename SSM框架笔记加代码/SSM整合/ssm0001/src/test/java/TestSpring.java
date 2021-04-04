import com.jcc.traval.entity.User;
import com.jcc.traval.service.IUserService;
import com.jcc.traval.vo.UserConditionVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestSpring {
    @Autowired
    IUserService userService ;

    @Test
    public void testSelect(){
        List<User> list = userService.list(new UserConditionVO());
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testInsert(){
        User user = new User() ;
        user.setName("ssm0002222");
        userService.insert(user) ;

    }
}
