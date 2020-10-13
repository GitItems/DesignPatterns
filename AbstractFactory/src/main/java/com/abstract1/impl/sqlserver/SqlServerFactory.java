package com.abstract1.impl.sqlserver;

import com.abstract1.IDepartment;
import com.abstract1.IFactory;
import com.abstract1.IUser;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.sqlserver
 * @ClassName: SqlServerFactory
 * @Author: MrChen
 * @Date: 2020/10/13 17:22
 */
public class SqlServerFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
