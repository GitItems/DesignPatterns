package com.command.children;

import com.command.Command;
import com.command.entity.Barbecuer;

/**
 * @ProjectName: Command
 * @Package: com.command.children
 * @ClassName: BakeMuttonCommand
 * @Author: MrChen
 * @Date: 2020/10/22 15:51
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString(){
        return "烤羊肉串";
    }
}
