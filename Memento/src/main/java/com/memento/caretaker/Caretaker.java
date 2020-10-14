package com.memento.caretaker;

import com.memento.Memento;

/**
 * @ProjectName: Memento
 * @Package: com.memento
 * @ClassName: Caretaker
 * @Author: MrChen
 * @Date: 2020/10/14 17:31
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
