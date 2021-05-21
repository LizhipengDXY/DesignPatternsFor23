package com.lanpo.design.singleton;

/**
 * @author li zhipeng
 * @date 2021/5/21
 * @Description:
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){

    }
    public static Mgr03 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
/*        Mgr03 m1 = Mgr03.getInstance();
        Mgr03 m2 = Mgr03.getInstance();
        System.out.println(m1 == m2);*/
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
