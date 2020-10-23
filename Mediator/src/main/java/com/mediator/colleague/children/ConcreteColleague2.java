package com.mediator.colleague.children;

import com.mediator.Mediator;
import com.mediator.colleague.Colleague;

/**
 * @ProjectName: Mediator
 * @Package: com.mediator.colleague.children
 * @ClassName: ConcreteColleague2
 * @Author: MrChen
 * @Date: 2020/10/23 9:46
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){

        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到信息:" + message);
    }
}
