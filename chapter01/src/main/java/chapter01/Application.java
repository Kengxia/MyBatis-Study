package chapter01;

import chapter01.mapper.UserMapper;
import chapter01.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:21 2018/8/3
 * @Description:
 */
public class Application {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis/config.xml";
        InputStream is = Application.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        System.out.println(session);
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper);
        User user  = new User("4","tes");
        userMapper.insertUser(user);
        session.commit();
        session.close();
//        User user= userMapper.getUserById("1");
//        System.out.println(user);

    }
} 