package com.mediator;

import com.mediator.colleague.Colleague;

/**
 * @ProjectName: Mediator
 * @Package: com.mediator
 * @ClassName: Mediator
 * @Author: MrChen
 * @Date: 2020/10/23 9:43
 */
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
