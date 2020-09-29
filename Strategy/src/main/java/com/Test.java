package com;

import java.util.Scanner;

/**
 * @ProjectName: ArithmeticStrategy
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/9/28 16:10
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商品数:");
        Integer number = scanner.nextInt();
        System.out.print("请输入商品单价:");
        Double price = scanner.nextDouble();
        System.out.println("结算方式: 1:正常收费\t2:满减优惠\t3:折扣优惠");
        System.out.print("请选择:");
        Integer type = scanner.nextInt();

        // 结算
        ContextArithmetic arithmetic = new ContextArithmetic(type);
        System.out.println("==================商品结算清单=================");
        System.out.println("商品数量:" + number);
        System.out.println("商品单价:" + price);
        System.out.println("商品总价:" + arithmetic.getResult(price, number));
        System.out.println("=============================================");
    }
}
