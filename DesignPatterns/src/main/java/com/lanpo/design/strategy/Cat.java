package com.lanpo.design.strategy;

/**
 * @author li zhipeng
 * @date 2021/5/11
 */
public class Cat {
    int weight,height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
