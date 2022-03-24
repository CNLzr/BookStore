import com.lzr.bookstore.dao.UserDao;
import com.lzr.bookstore.dao.impl.UserDaoImpl;
import com.lzr.bookstore.entity.User;
import com.lzr.bookstore.mapper.UserMapper;
import com.lzr.bookstore.service.UserService;
import com.lzr.bookstore.service.impl.UserServiceImpl;
import com.lzr.bookstore.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setAccount("lzr");
        user.setPassword("lzr");
        user.setEmail("lzr@163.com");
        user.setAvatar("abc");
        user.setScore(1);
        user.setRegtime(new Date());
//        user.setVcode("123456");
        user.setStatus("y");
        boolean rest = userService.addUser(user);
        if(rest){
            LOGGER.debug(">>>添加用户成功");
        }else {
            LOGGER.debug(">>>添加用户失败");
        }
    }
}
