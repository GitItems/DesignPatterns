package com.observer.subject;

import com.observer.Observer;
import com.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Observer
 * @Package: com.entity
 * @ClassName: Secretary
 * @Author: MrChen
 * @Date: 2020/10/13 14:09
 */
public class Secretary implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String action;

    /**
     * @Param: [observer]
     * @Return: void
     * @Author: we
     * @Date: 2020/10/13 14:14
     * 添加
     */
    public void attach(Observer observer){

        observers.add(observer);
    }

    /*
     * @Param: [observer]
     * @Return: void
     * @Author: we
     * @Date: 2020/10/13 14:15
     * 减少
     */
    public void detach(Observer observer){

        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer:
                observers) {
            observer.update();
        }
    }

    public void setAction(String action){
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }
}
