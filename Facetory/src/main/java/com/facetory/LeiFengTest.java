package com.facetory;

import com.facetory.leifen.IFactory;
import com.facetory.leifen.LeiFeng;
import com.facetory.leifen.chilren.UndergraduateFactory;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory
 * @ClassName: LeiFengTest
 * @Author: MrChen
 * @Date: 2020/10/10 10:33
 */
public class LeiFengTest {

    public static void main(String[] args) {

        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
