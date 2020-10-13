package com;

import com.observer.Subject;
import com.observer.subject.Boss;
import com.observer.observer.NBAObserver;
import com.observer.observer.StockObserver;

/**
 * @ProjectName: Observer
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/13 14:02
 */
public class Test {

    public static void main(String[] args) {

        // 前台小姐姐
        Subject boss = new Boss();
        // 看股票的同事
        StockObserver colleague1 = new StockObserver("魏关姹", boss);
        StockObserver colleague2 = new StockObserver("易管查", boss);
        NBAObserver colleague3 = new NBAObserver("肖大宝", boss);
        // 记下同事
        boss.attach(colleague1);
        boss.attach(colleague2);
        boss.attach(colleague3);
        // 老板回来了
        boss.setAction("老板从正门回来了");

        // 魏关姹 没看到老板
        boss.detach(colleague1);
        // 通知同事
        boss.notifyObserver();

    }
}
