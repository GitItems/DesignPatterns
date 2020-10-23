package com;

import com.singleton.Singleton;

/**
 * @ProjectName: Singleton
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/16 11:52
 */
public class Test extends Thread{

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2){
            System.out.println("两个对象是相同实例。");
        }

        for (int i = 0; i < 10000; i++) {
            new MyThread().run();
        }
    }


    public static class MyThread implements Runnable{
//        public MyThread(String name){
//            super(name);
//        }
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println( singleton.hashCode());
        }
    }

}
