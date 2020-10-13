package com.abstract1.impl.sqlserver;

import com.abstract1.IUser;
import com.abstract1.entity.User;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.sqlserver
 * @ClassName: SqlServerUser
 * @Author: MrChen
 * @Date: 2020/10/13 17:23
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("[Sql_Server]保存User" + user);
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("[Sql_Server]通过ID 找到User");
        return new User();
    }
}
