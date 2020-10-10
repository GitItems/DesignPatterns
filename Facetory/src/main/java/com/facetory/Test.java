package com.facetory;

import com.facetory.create.CreateUFunc;
import com.facetory.ufunc.UFunc;

import java.util.Scanner;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/10 9:47
 */
public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println("简单工厂模式");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        double numberA = scanner.nextDouble();
        System.out.println("请输入操作符:");
        String operation = scanner.next();
        System.out.println("请输入第二个数:");
        double numberB = scanner.nextDouble();

        UFunc uFunc = CreateUFunc.createUFunc(operation);
        uFunc.setValueA(numberA);
        uFunc.setValueB(numberB);

        System.out.println("计算结果为:" + uFunc.getResult());
    }
}
