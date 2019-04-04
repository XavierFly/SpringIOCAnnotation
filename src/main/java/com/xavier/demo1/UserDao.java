package com.xavier.demo1;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    public void save() {
        System.out.println("保存用户（Dao）");
    }
}
