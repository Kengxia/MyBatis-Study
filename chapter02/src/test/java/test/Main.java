package test;

import chapter02.service.impl.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 17:10 2018/8/3
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        ServiceImpl serviceImpl= (ServiceImpl)applicationContext.getBean("serviceImpl");
        try {
            System.out.println(serviceImpl.getUserById("4"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 