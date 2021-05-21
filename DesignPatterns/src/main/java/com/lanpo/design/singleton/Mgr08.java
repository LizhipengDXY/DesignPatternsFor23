package com.lanpo.design.singleton;

/**
 * @author li zhipeng
 * @date 2021/5/21
 * @Description:
 */
public enum Mgr08 {
    INSTANCE,
    ;

    public void m(){

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
