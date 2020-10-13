package com.observer.observer;

import com.observer.Subject;
import com.observer.Observer;

/**
 * @ProjectName: Observer
 * @Package: com.observer.observer
 * @ClassName: StockObserver
 * @Author: MrChen
 * @Date: 2020/10/13 14:10
 * 秘书类
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "," +  name + "关闭股票行情, 继续工作!");
    }
}
