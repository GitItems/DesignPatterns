package com;

import com.template.TestPaper;
import com.template.children.TestPaperA;
import com.template.children.TestPaperB;

/**
 * @ProjectName: Template
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/10 16:48
 */
public class Test {

    public static void main(String[] args) {

        TestPaper testPaperA = new TestPaperA();

        TestPaper testPaperB = new TestPaperB();
        System.out.println("------------测试A:------------");
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        System.out.println("------------测试B:------------");
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();

    }
}
