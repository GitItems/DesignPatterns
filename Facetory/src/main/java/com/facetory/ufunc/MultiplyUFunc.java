package com.facetory.ufunc;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.ufunc
 * @ClassName: MultiplyUFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:29
 * 乘法运算类
 */
public class MultiplyUFunc extends UFunc{

    @Override
    public String getResult() throws ArithmeticException {
        double result = super.valueA * super.valueB;
        return String.valueOf(result);
    }
}
