package com.entity.children;

/**
 * @ProjectName: Adapter
 * @Package: com.entity.children
 * @ClassName: ForeignCenter
 * @Author: MrChen
 * @Date: 2020/10/14 14:17
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("翻译: 中锋" + name + "进攻!");
    }

    public void defense(){
        System.out.println("翻译: 中锋" + name + "撤退!");
    }
}
