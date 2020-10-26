package com.interpret.children.expression;

import com.interpret.Expression;

/**
 * @ProjectName: Interpret
 * @Package: com.interpret.children.expression
 * @ClassName: Scale
 * @Author: MrChen
 * @Date: 2020/10/26 16:50
 */
public class Scale extends Expression {
    @Override
    public void execute(String playKey, double playValue) {
        String scale = "";
        switch ((int) playValue){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}
