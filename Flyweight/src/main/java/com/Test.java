package com;

import com.flyweight.Flyweight;
import com.flyweight.WebSite;
import com.flyweight.children.ConcreteFlyweight;
import com.flyweight.children.UnsharedConcreteFlyweight;
import com.flyweight.entity.User;
import com.flyweight.factory.FlyweightFactory;
import com.flyweight.factory.WebSiteFactory;

/**
 * @ProjectName: Flyweight
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/23 14:29
 */
public class Test {

    public static void main(String[] args) {
//        int extrinsicState = 22;
//
//        FlyweightFactory factory = new FlyweightFactory();
//        Flyweight fx = factory.getFlyweight("X");
//        fx.operation(--extrinsicState);
//
//        Flyweight fy = factory.getFlyweight("Y");
//        fy.operation(--extrinsicState);
//
//        Flyweight fz = factory.getFlyweight("Z");
//        fz.operation(--extrinsicState);
//
//        Flyweight uf = new UnsharedConcreteFlyweight();
//        uf.operation(--extrinsicState);
//
//        Flyweight newF = new ConcreteFlyweight();
//        newF.operation(--extrinsicState);

        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.user(new User("小菜"));

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.user(new User("大鸟"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.user(new User("娇娇"));

        WebSite fl = factory.getWebSiteCategory("博客");
        fl.user(new User("老顽童"));

        WebSite fm = factory.getWebSiteCategory("博客");
        fm.user(new User("桃谷六仙"));

        WebSite fn = factory.getWebSiteCategory("博客");
        fn.user(new User("南海鳄神"));

        System.out.println("网站分类总数为:" + factory.getWebSiteCount());
    }
}
