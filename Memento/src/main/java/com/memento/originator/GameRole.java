package com.memento.originator;

import com.memento.RoleStateMemento;

/**
 * @ProjectName: Memento
 * @Package: com.memento
 * @ClassName: GameRole
 * @Author: MrChen
 * @Date: 2020/10/14 17:21
 */
public class GameRole {

    private int vit;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    private int atk;

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    private int def;

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public RoleStateMemento saveState(){

        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVitality();
        this.atk = memento.getAttack();
        this.def = memento.getDefense();
    }

    public void stateDisplay(){
        System.out.println("\t角色当前状态:");
        System.out.println("\t体力:" + this.vit );
        System.out.println("\t攻击力:" + this.atk);
        System.out.println("\t防御力:" + this.def);
    }

    public void getIntiState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
}
