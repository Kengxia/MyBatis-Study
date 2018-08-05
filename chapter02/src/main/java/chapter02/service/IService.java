package chapter02.service;

import chapter02.pojo.User;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 17:12 2018/8/3
 * @Description:
 */
public interface IService {

    public User getUserById(String userId) throws Exception;
} 