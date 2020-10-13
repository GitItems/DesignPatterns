package com.abstract1;

import com.abstract1.entity.Deptratment;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl
 * @ClassName: IDepartment
 * @Author: MrChen
 * @Date: 2020/10/13 17:30
 */
public interface IDepartment {

    void insert(Deptratment deptratment);

    Deptratment getDeptratment(Integer id);
}
