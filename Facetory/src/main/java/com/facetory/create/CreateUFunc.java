package com.facetory.create;

import com.facetory.ufunc.*;

import java.util.InputMismatchException;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.create
 * @ClassName: CreateUFunc
 * @Author: MrChen
 * @Date: 2020/9/27 17:21
 */
public class CreateUFunc {

    public static UFunc createUFunc(String operators)throws Exception{
        if (operators == null){
            throw new Exception("操作符不能为空!");
        }
        switch (operators.trim()){
            case "+":
                return new AddUFunc();
            case "-":
                return new SubtractUFunc();
            case "*":
                return new MultiplyUFunc();
            case "/":
                return new DivideUFunc();
            default:
                throw new InputMismatchException();
        }
    }
}
