package com;

import com.abstract1.IDepartment;
import com.abstract1.IFactory;
import com.abstract1.IUser;
import com.abstract1.entity.Deptratment;
import com.abstract1.entity.User;
import com.abstract1.impl.access.AccessFactory;
import com.abstract1.impl.sqlserver.SqlServerFactory;

/**
 * @ProjectName: AbstractFactory
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/13 16:37
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment department = factory.createDepartment();
        department.insert(new Deptratment());
        department.getDeptratment(1);
    }
}
