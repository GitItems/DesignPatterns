package com.component.composite;

import com.component.Company;
import com.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Component
 * @Package: com.component.composite
 * @ClassName: ConcreteCompany
 * @Author: MrChen
 * @Date: 2020/10/15 13:58
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);

        for (Company company:
                children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company:
                children) {
            company.lineOfDuty();
        }
    }
}
