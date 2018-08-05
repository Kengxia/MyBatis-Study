package chapter01.mapper;

import chapter01.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:20 2018/8/3
 * @Description:
 */
public interface UserMapper {

    public User getUserById(@Param("userId") String userId) throws Exception;

    public void insertUser(User user) throws Exception;
}