package com.interpret.children;

import com.interpret.AbstractExpression;
import com.interpret.publice.Context;

/**
 * @ProjectName: Interpret
 * @Package: com.interpret.children
 * @ClassName: TerminalExpression
 * @Author: MrChen
 * @Date: 2020/10/26 16:20
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context Context) {
        System.out.println("终端解释器");
    }
}
