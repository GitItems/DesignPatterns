package com.abstract1.impl.access;

import com.abstract1.IDepartment;
import com.abstract1.entity.Deptratment;

/**
 * @ProjectName: AbstractFactory
 * @Package: com.abstract1.impl.access
 * @ClassName: AccessDepartment
 * @Author: MrChen
 * @Date: 2020/10/13 17:34
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Deptratment deptratment) {
        System.out.println("[Access]保存Deptratment" + deptratment);
    }

    @Override
    public Deptratment getDeptratment(Integer id) {
        System.out.println("[Access]通过ID 找到Deptratment");
        return new Deptratment();
    }
}
