package com.state.entity;

import com.state.State;
import com.state.children.ForenoonState;

/**
 * @ProjectName: State
 * @Package: com.state.entity
 * @ClassName: Work
 * @Author: MrChen
 * @Date: 2020/10/14 10:39
 */
public class Work {

    private long hour;

    private State state;

    private boolean taskFinished;

    public long getHour() {
        return hour;
    }

    public void setHour(long hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }

    public Work(){
        state = new ForenoonState();
    }
}
