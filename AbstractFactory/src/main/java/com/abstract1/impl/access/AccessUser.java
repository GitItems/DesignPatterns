package com.abstract1.impl.access;

import com.abstract1.IUser;
import com.abstract1.entity.User;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.access
 * @ClassName: AccessUser
 * @Author: MrChen
 * @Date: 2020/10/13 17:23
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("[Access] 保存User" + user);
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("[Access]通过ID 找到User");
        return new User();
    }
}
