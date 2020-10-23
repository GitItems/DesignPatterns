package com;

import com.mediator.children.ConcreteMediator;
import com.mediator.colleague.children.ConcreteColleague1;
import com.mediator.colleague.children.ConcreteColleague2;

/**
 * @ProjectName: Mediator
 * @Package: PACKAGE_NAME
 * @ClassName: com.Test
 * @Author: MrChen
 * @Date: 2020/10/23 9:41
 */
public class Test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("吃过饭了吗?");
        colleague2.send("没有呢, 你打算请客?");
    }
}
