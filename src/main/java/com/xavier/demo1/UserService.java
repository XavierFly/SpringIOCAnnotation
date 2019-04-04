package com.xavier.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 传统方式需要去 XML 中配置 <bean id="" class=""></bean>
 *
 */
// @Component("userService")
@Service("userService")
public class UserService {
    @Value("米饭")
    private String something;

    // @Autowired
    // @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public void eat() {
        System.out.println("eat:" + something);
    }

    public void save() {
        System.out.println("保存用户（Service）");
        userDao.save();
    }
}
