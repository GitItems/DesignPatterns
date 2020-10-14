package com;

import com.state.entity.Work;

/**
 * @ProjectName: State
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/14 10:22
 */
public class Test {

    public static void main(String[] args) {

        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(18);
        work.writeProgram();

        work.setTaskFinished(false);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();



    }
}
