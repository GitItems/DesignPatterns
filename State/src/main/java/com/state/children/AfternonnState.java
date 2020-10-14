package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: AfternonnState
 * @Author: MrChen
 * @Date: 2020/10/14 10:51
 */
public class AfternonnState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17){
            System.out.println("当前时间:" +work.getHour()+"下午状态不错, 继续努力!");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
