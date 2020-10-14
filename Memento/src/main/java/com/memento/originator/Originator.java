package com.memento.originator;

import com.memento.Memento;

/**
 * @ProjectName: Memento
 * @Package: com.memento
 * @ClassName: Originator
 * @Author: MrChen
 * @Date: 2020/10/14 17:27
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("State = " + state);
    }
}
