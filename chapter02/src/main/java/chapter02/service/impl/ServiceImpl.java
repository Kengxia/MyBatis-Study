package chapter02.service.impl;

import chapter02.mapper.UserMapper;
import chapter02.pojo.User;
import chapter02.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 17:13 2018/8/3
 * @Description:
 */
@Service("serviceImpl")
public class ServiceImpl implements IService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String userId) throws Exception {
        return userMapper.getUserById(userId);
    }
}