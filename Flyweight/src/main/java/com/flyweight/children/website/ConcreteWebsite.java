package com.flyweight.children.website;

import com.flyweight.WebSite;
import com.flyweight.entity.User;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.children.website
 * @ClassName: ConcreteWebsite
 * @Author: MrChen
 * @Date: 2020/10/23 16:59
 */
public class ConcreteWebsite extends WebSite {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void user(User user) {
        System.out.println("网站分类:" + name + ",用户:" + user.getName());
    }

    public ConcreteWebsite(String name){
        this.name = name;
    }
}
