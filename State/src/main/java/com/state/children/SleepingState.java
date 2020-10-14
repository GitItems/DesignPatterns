package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: SleepingState
 * @Author: MrChen
 * @Date: 2020/10/14 10:55
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" +work.getHour()+" 呼、呼、呼~~");
    }
}
