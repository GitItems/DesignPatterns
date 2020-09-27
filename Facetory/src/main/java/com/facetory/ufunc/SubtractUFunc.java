package com.facetory.ufunc;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.ufunc
 * @ClassName: SubtractUFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:27
 * 减法运算类
 */
public class SubtractUFunc extends UFunc{

    @Override
    public String getResult() throws ArithmeticException {
        double result = super.valueA - super.valueB;
        return String.valueOf(result);
    }
}
