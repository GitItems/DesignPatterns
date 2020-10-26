package com;

import com.interpret.AbstractExpression;
import com.interpret.Expression;
import com.interpret.children.NonterminalExpression;
import com.interpret.children.TerminalExpression;
import com.interpret.children.expression.Note;
import com.interpret.children.expression.Scale;
import com.interpret.publice.Context;
import com.interpret.publice.PlayContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Interpret
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/26 16:16
 */
public class Test {

    public static void main(String[] args) {

//        Context context = new Context();
//        List<AbstractExpression> list = new ArrayList<>();
//        list.add(new TerminalExpression());
//        list.add(new NonterminalExpression());
//        list.add(new TerminalExpression());
//        list.add(new TerminalExpression());
//
//        for (AbstractExpression abstractExpression : list) {
//            abstractExpression.interpret(context);
//        }
        PlayContext context = new PlayContext();

        System.out.println("上海滩");
        context.setText("O 2 E 0.5 G 0.5 A 3 E 0.55 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        while (context.getText().length() > 0){

            String str = context.getText().substring(0, 1);
            switch (str){
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                default:
                    continue;

            }
            if (expression != null){
                expression.interpret(context);
            }
        }
    }
}
