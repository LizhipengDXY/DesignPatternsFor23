package com.lanpo.design.singleton;

/**
 * @author li zhipeng
 * @date 2021/5/21
 * @Description:
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){

    }
    public static synchronized Mgr04 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
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
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
