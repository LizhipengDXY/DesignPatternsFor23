package com.lanpo.design.abstractfactory;

/**
 * @author li zhipeng
 * @date 2021/5/24
 * @Description:
 */
public class MagicFactory extends AbastractFactory{
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
