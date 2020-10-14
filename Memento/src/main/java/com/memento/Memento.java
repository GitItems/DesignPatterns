package com.memento;

/**
 * @ProjectName: Memento
 * @Package: com.memento
 * @ClassName: Memento
 * @Author: MrChen
 * @Date: 2020/10/14 17:29
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state){

        this.state = state;
    }
}
