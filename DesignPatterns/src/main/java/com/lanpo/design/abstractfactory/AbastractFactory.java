package com.lanpo.design.abstractfactory;

/**
 * @author li zhipeng
 * @date 2021/5/24
 * @Description:
 */
public abstract class AbastractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
