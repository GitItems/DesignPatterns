package com.singleton;

/**
 * @ProjectName: Singleton
 * @Package: com.singleton
 * @ClassName: LockSingleton
 * @Author: MrChen
 * @Date: 2020/10/16 11:57
 * 懒汉配锁单例模式
 */
public class LockSingleton {

    private LockSingleton(){}

    private static LockSingleton instance;
    private static volatile Object syncRoot = new Object();

    public static LockSingleton getInstance(){

        if (instance == null){
            synchronized (syncRoot){
                if (instance == null) {
                    instance = new LockSingleton();
                }
            }
        }

        return instance;
    }
}
