package com;

import com.facetory.create.CreateUFunc;
import com.facetory.ufunc.UFunc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ProjectName: Facetory
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/9/27 17:12
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // 初始化值
            double valueA,valueB;
            String result;
            String operators;

            String exit = "yes";
            System.out.print("请输入值:");
            valueA = scanner.nextDouble();
            do {
                System.out.print("操作符(输入esc结束程序):");
                operators = scanner.next();
                if (exit.toLowerCase().trim().equals("esc")){
                    return;
                }
                System.out.print("请输入值:");
                valueB = scanner.nextDouble();
                // 计算值
                UFunc uFunc = CreateUFunc.createUFunc(operators);
                uFunc.setValueA(valueA);
                uFunc.setValueB(valueB);
                result = uFunc.getResult();
                System.out.println("==============================");
                System.out.println("计算结果为:" + uFunc.getResult());
                System.out.println("==============================");

                valueA = Double.parseDouble(result);
            } while (true);

        } catch (InputMismatchException e){
            System.out.println("输入数值不符合规范,系统结束!");
        } catch (NumberFormatException e){
            System.out.println("系统结束!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
