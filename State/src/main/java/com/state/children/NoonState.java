package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: NoonState
 * @Author: MrChen
 * @Date: 2020/10/14 10:49
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13){
            System.out.println("当前时间:" +work.getHour()+"饿了,吃午饭; 犯困, 午休!");
        } else {
            work.setState(new AfternonnState());
            work.writeProgram();
        }
    }
}
