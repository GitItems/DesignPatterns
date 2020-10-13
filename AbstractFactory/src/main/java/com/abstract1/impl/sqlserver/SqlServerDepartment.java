package com.abstract1.impl.sqlserver;

import com.abstract1.IDepartment;
import com.abstract1.entity.Deptratment;
import com.abstract1.entity.User;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.sqlserver
 * @ClassName: SqlServerDepartment
 * @Author: MrChen
 * @Date: 2020/10/13 17:32
 */
public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert(Deptratment deptratment) {
        System.out.println("[Sql_Server]保存Deptratment" + deptratment);
    }

    @Override
    public Deptratment getDeptratment(Integer id) {
        System.out.println("[Sql_Server]通过ID 找到Deptratment");
        return new Deptratment();
    }
}
