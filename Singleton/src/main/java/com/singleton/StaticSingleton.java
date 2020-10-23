package com.singleton;

/**
 * @ProjectName: Singleton
 * @Package: com.singleton
 * @ClassName: StaticSingleton
 * @Author: MrChen
 * @Date: 2020/10/16 14:17
 * 饿汉静态单例模式
 */
public class StaticSingleton {

    private static final StaticSingleton instance = new StaticSingleton();

    private StaticSingleton(){}

    public static  StaticSingleton getInstance(){

        return instance;
    }
}
