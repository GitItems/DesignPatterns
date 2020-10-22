package com.command;

import com.command.entity.Barbecuer;

/**
 * @ProjectName: Command
 * @Package: com.command
 * @ClassName: Command
 * @Author: MrChen
 * @Date: 2020/10/22 15:39
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    abstract public void executeCommand();
}
