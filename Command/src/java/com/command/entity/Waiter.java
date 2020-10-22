package com.command.entity;

import com.command.Command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: Command
 * @Package: com.command.entity
 * @ClassName: Waiter
 * @Author: MrChen
 * @Date: 2020/10/22 16:13
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){

//        this.command = command;
        if ("烤鸡翅".equals(command.toString())){
            System.out.println("吃个der, 没有鸡翅了!");
            return;
        }
        orders.add(command);
        System.out.println("增加订单:" + command.toString() + ",时间:" + new Date());
    }

    public void cancelOrder(Command command){

        orders.remove(command);
        System.out.println("取消订单:" + command.toString() + ",时间:" + new Date());
    }

    public void executeNotify(){
        for (Command command:
             orders) {
            command.executeCommand();
        }
    }
}
