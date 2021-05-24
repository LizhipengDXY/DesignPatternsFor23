package com.lanpo.design.abstractfactory;

import com.lanpo.design.factorymethod.CarFactory;
import com.lanpo.design.factorymethod.Moveable;

/**
 * @author li zhipeng
 * @date 2021/5/13
 */
public class Main {
    public static void main(String[] args) {
        AbastractFactory f = new ModernFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}
