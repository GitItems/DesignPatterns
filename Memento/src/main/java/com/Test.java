package com;

import com.memento.caretaker.Caretaker;
import com.memento.caretaker.RoleStateCaretaker;
import com.memento.originator.GameRole;
import com.memento.originator.Originator;

/**
 * @ProjectName: Memento
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/14 17:19
 */
public class Test {

    public static void main(String[] args) {

        Originator o = new Originator();
        o.setState("ON");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("OFF");
        o.show();

        o.setMemento(c.getMemento());
        o.show();

        System.out.println("大战BOSS前...");
        GameRole gameRole = new GameRole();
        gameRole.getIntiState();
        gameRole.stateDisplay();
        System.out.println("保存进度...");
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(gameRole.saveState());
        System.out.println("大战BOSS时, 损耗严重...");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("读取已存进度...");
        gameRole.recoveryState(stateAdmin.getMemento());
        gameRole.stateDisplay();

    }
}
