package com.component.leaf;

import com.component.Company;

/**
 * @ProjectName: Component
 * @Package: com.component.leaf
 * @ClassName: HRDepartment
 * @Author: MrChen
 * @Date: 2020/10/15 14:00
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
