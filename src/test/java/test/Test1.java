package test;

import com.easy.config.info.DataConfig;
import com.easy.config.info.JdbcInfo;
import com.easy.config.info.ServletConfig;
import com.easy.config.info.WebConfig;
import com.easy.dao.UserDao;
import com.easy.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, WebConfig.class,
        ServletConfig.class,JdbcInfo.class})
public class Test1 {
    @Autowired
    private UserDao userDao;
    @Test
    public void testTx() {
        User user=new User("aaa","11");
       userDao.insertUser(user);
    }
}
