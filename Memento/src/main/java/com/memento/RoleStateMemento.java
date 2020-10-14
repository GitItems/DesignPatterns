package com.memento;

/**
 * @ProjectName: Memento
 * @Package: com.memento.originator
 * @ClassName: RoleStateMemento
 * @Author: MrChen
 * @Date: 2020/10/14 17:40
 */
public class RoleStateMemento {

    private int vitality;
    private int attack;
    private int defense;

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getVitality() {
        return vitality;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public RoleStateMemento(int vit, int atk, int def) {
        this.vitality = vit;
        this.attack = atk;
        this.defense = def;
    }
}
