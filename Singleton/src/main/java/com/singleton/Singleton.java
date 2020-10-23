package com.singleton;

/**
 * @ProjectName: Singleton
 * @Package: com.singleton
 * @ClassName: Singleton
 * @Author: MrChen
 * @Date: 2020/10/16 11:53
 * 懒汉单例模式
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){

        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
