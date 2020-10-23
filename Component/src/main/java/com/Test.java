package com;

import com.component.composite.Composite;
import com.component.composite.ConcreteCompany;
import com.component.leaf.FinanceDepartment;
import com.component.leaf.HRDepartment;
import com.component.leaf.Leaf;

/**
 * @ProjectName: Component
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/15 10:26
 */
public class Test {

    public static void main(String[] args) {

//        Composite root = new Composite("root");
//        root.add(new Leaf("Leaf A"));
//        root.add(new Leaf("Leaf B"));
//
//        Composite comp = new Composite("Composite X");
//        comp.add(new Leaf("Leaf XA"));
//        comp.add(new Leaf("Leaf XB"));
//
//        root.add(comp);
//
//        Composite comp2 = new Composite("Composite XY");
//        comp2.add(new Leaf("Leaf XYA"));
//        comp2.add(new Leaf("Leaf XYB"));
//
//        root.add(comp2);
//
//        root.add(new Leaf("Leaf C"));
//
//        Leaf leaf = new Leaf("Leaf D");
//        root.add(leaf);
//        root.remove(leaf);
//
//        root.display(2);


        System.out.println("=====================================");

        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);
        ConcreteCompany comp2 = new ConcreteCompany("南京办事处");
        comp2.add(new HRDepartment("南京办事处人力资源部"));
        comp2.add(new FinanceDepartment("南京办事处财务部"));
        root.add(comp2);
        ConcreteCompany comp3 = new ConcreteCompany("杭州办事处");
        comp3.add(new HRDepartment("杭州办事处人力资源部"));
        comp3.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(comp3);
        System.out.println("\n --------------- 结构图 ---------------");
        root.display(2);
        System.out.println("\n ---------------  职责  ---------------");
        root.lineOfDuty();

    }
}
