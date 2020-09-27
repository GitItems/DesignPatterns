package com.facetory.ufunc;

import com.facetory.ufunc.UFunc;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory
 * @ClassName: AddUFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:24
 * 加法运算类
 */
public class AddUFunc extends UFunc {

    @Override
    public String getResult() throws ArithmeticException {
        double result = super.valueA + super.valueB;
        return String.valueOf(result);
    }
}
