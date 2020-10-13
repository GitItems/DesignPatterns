package com.abstract1;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1
 * @ClassName: IFactory
 * @Author: MrChen
 * @Date: 2020/10/13 17:21
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
