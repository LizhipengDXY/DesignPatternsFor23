package com.lanpo.interface1_8;

/**
 * @author li zhipeng
 * @date 2021/5/12
 */
public class Animal implements IWalk,IEat{
    @Override
    public void walk() {
        System.out.println("Animal walk");
    }

    @Override
    public void eat() {
        System.out.println("Animal eat!");
    }
}
