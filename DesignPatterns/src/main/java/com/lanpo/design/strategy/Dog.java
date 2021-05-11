package com.lanpo.design.strategy;

/**
 * @author li zhipeng
 * @date 2021/5/11
 */
public class Dog {
    int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
