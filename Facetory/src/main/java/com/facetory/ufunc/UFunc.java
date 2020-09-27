package com.facetory.ufunc;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.create
 * @ClassName: UFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:18
 */
public abstract class UFunc {

    protected double valueA = 0;

    protected double valueB = 0;

    public abstract String getResult() throws ArithmeticException;


    public void setValueA(double valueA) {
        this.valueA = valueA;
    }
    public void setValueB(double valueB) {
        this.valueB = valueB;
    }
}
