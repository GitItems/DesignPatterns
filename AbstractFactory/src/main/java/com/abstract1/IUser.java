package com.abstract1;

import com.abstract1.entity.User;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1
 * @ClassName: IUser
 * @Author: MrChen
 * @Date: 2020/10/13 17:22
 */
public interface IUser {

    void insert(User user);

    User getUser(Integer id);
}
