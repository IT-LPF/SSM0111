import com.zking.pojo.User;
import com.zking.services.UserService;
import com.zking.services.impl.UserServiceImpl;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @Author: lpf
 * @Date 2018/10/23/023  19:45
 **/

public class redisTest {


/*    @Test
    public void redisTest(){
        Jedis jedis = new Jedis("192.168.227.128", 6379);
        System.out.println(jedis.ping());
    }*/


    @Test
    public void test(){
        UserService userService = new UserServiceImpl();
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
        System.out.println(123123132);
    }














}
