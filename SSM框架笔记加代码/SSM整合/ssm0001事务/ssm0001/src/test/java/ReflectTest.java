import com.jcc.traval.entity.User;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classu = Class.forName("com.jcc.traval.entity.User");
        //得到user类的全部属性（修饰符+类型+名字）
        Field[] userFields = classu.getDeclaredFields();
        User user = new User();
        Map<String,Object> map=new HashMap <String,Object>();

    }
}
