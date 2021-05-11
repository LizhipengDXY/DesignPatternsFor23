package com.lanpo.design.factorymethod;

/**
 * @author li zhipeng
 * @date 2021/5/13
 * @Description:
 */
public class CarFactory {
    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
