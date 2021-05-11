package com.lanpo.design.factorymethod;

/**
 * @author li zhipeng
 * @date 2021/5/13
 * @Description: 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
