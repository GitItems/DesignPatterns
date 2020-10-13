package com.observer.observer;

import com.observer.Subject;
import com.observer.Observer;

/**
 * @ProjectName: Observer
 * @Package: com.observer.observer
 * @ClassName: NBAObserver
 * @Author: MrChen
 * @Date: 2020/10/13 14:20
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println( subject.getAction() + "," + name + "关闭NBA直播, 继续工作!");
    }
}
