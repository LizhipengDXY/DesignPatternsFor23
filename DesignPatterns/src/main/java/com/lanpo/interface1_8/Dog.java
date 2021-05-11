package com.lanpo.interface1_8;

/**
 * @author li zhipeng
 * @date 2021/5/12
 */
public class Dog extends Animal implements IEat,IWalk{
    @Override
    public void eat(){
        System.out.println("Dog eat");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}
