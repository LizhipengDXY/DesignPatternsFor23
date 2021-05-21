package com.lanpo.design.singleton;

/**
 * @author li zhipeng
 * @date 2021/5/21
 * @Description:
 */
public class Mgr07 {
    private static Mgr07 INSTANCE;

    private Mgr07(){

    }
    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }
    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
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
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
