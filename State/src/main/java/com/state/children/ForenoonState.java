package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: ForenoonState
 * @Author: MrChen
 * @Date: 2020/10/14 10:40
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println("当前时间:" +work.getHour()+"上午工作,精神百倍!");
        } else { // 超过十二点则转到中午工作状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
