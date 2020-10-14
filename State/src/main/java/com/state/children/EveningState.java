package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: EveningState
 * @Author: MrChen
 * @Date: 2020/10/14 10:52
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.isTaskFinished()){

            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() > 20){
                work.setState(new CompelRestState());
                work.writeProgram();
            } else if (work.getHour() < 21){
                System.out.println("当前时间:" +work.getHour()+"加班、加班、加班!");
            } else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
