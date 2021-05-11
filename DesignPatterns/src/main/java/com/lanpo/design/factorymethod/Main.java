package com.lanpo.design.factorymethod;

/**
 * @author li zhipeng
 * @date 2021/5/13
 */
public class Main {
    public static void main(String[] args) {
/*        Car c = new Car();
        c.go();*/
/*        Plane plane = new Plane();
        plane.go();*/
/*        Moveable m = new SimpleVehicleFactory().createBroom();
        m.go();*/
        Moveable m = new CarFactory().create();
        m.go();
    }
}
