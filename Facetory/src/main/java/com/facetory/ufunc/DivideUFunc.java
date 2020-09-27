package com.facetory.ufunc;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.ufunc
 * @ClassName: DivideUFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:30
 * 除法运算类
 */
public class DivideUFunc extends UFunc{

    @Override
    public String getResult() throws ArithmeticException {
        if (super.valueA == 0){
            return "除数不能为0!";
        }
        double result = super.valueA / super.valueB;
        return String.valueOf(result);
    }
}
