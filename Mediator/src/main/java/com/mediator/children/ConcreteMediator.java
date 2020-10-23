package com.mediator.children;

import com.mediator.Mediator;
import com.mediator.colleague.Colleague;
import com.mediator.colleague.children.ConcreteColleague1;
import com.mediator.colleague.children.ConcreteColleague2;

/**
 * @ProjectName: Mediator
 * @Package: com.mediator.colleague.children
 * @ClassName: ConcreteMediator
 * @Author: MrChen
 * @Date: 2020/10/23 9:45
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    @Override
    public void send(String message, Colleague colleague) {

        if (colleague == concreteColleague1){
            concreteColleague2.notify(message);
        }else {
            concreteColleague1.notify(message);
        }

    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
