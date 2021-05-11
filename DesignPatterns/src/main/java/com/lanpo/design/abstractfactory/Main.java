package com.lanpo.design.abstractfactory;

import com.lanpo.design.factorymethod.CarFactory;
import com.lanpo.design.factorymethod.Moveable;

/**
 * @author li zhipeng
 * @date 2021/5/13
 */
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.go();
        AK47 w = new AK47();
        w.shoot();
        Bread b = new Bread();
        b.printName();
    }
}
