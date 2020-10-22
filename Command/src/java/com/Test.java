package com;

import com.command.Command;
import com.command.children.BakeChickenWingCommand;
import com.command.children.BakeMuttonCommand;
import com.command.entity.Barbecuer;
import com.command.entity.Waiter;

/**
 * @ProjectName: Command
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/22 15:39
 */
public class Test {

    public static void main(String[] args) {

        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);

        girl.executeNotify();
    }
}
