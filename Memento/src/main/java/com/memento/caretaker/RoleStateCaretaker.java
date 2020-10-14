package com.memento.caretaker;

import com.memento.RoleStateMemento;

/**
 * @ProjectName: Memento
 * @Package: com.memento.caretaker
 * @ClassName: RoleStateCaretaker
 * @Author: MrChen
 * @Date: 2020/10/14 17:44
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

    public RoleStateMemento getMemento() {
        return memento;
    }
}
