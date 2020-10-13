package com.observer;

/**
 * @ProjectName: Observer
 * @Package: com.observer
 * @ClassName: Subject
 * @Author: MrChen
 * @Date: 2020/10/13 14:30
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();

    void setAction(String action);
    String getAction();
}
