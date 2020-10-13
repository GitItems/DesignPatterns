package com.abstract1.impl.access;

import com.abstract1.IDepartment;
import com.abstract1.IFactory;
import com.abstract1.IUser;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.access
 * @ClassName: AccessFactory
 * @Author: MrChen
 * @Date: 2020/10/13 17:23
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
