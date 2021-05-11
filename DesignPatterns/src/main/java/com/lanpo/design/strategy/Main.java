package com.lanpo.design.strategy;

import java.util.Arrays;

/**
 * @author li zhipeng
 * @date 2021/5/11
 */
public class Main {
    public static void main(String[] args) {
/*        //Dog的策略
        Dog[] d = {new Dog(2), new Dog(6), new Dog(1)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(d, new DogComparator());
        System.out.println(Arrays.toString(d));*/
        // 猫的重量策略
        Cat[] c = {new Cat(1,1), new Cat(7,7), new Cat(4,4), new Cat(9,9)};
        Sorter<Cat> sorter = new Sorter<>();
        //sorter.sort(c, new CatWeightComparator());
        sorter.sort(c,((o1, o2) -> {
            if(o1.weight < o2.weight) return -1;
            else if(o1.weight > o2.weight) return 1;
            else return 0;
        }));
        System.out.println(Arrays.toString(c));
    }
}
