package com.state.children;

import com.state.State;
import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com.state.children
 * @ClassName: CompelRestState
 * @Author: MrChen
 * @Date: 2020/10/14 11:03
 */
public class CompelRestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + "公司20点停电, 强制下班了!");
    }
}
