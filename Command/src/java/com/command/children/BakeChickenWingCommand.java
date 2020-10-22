package com.command.children;

import com.command.Command;
import com.command.entity.Barbecuer;

/**
 * @ProjectName: Command
 * @Package: com.command.children
 * @ClassName: BakeChickenWingCommand
 * @Author: MrChen
 * @Date: 2020/10/22 15:51
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString(){
        return "烤鸡翅";
    }
}
