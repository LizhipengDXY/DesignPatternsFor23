package com.lanpo.design.abstractfactory;

/**
 * @author li zhipeng
 * @date 2021/5/24
 * @Description:
 */
public class ModernFactory extends AbastractFactory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
