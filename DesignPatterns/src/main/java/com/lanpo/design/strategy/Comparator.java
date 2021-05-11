package com.lanpo.design.strategy;

/**
 * @author li zhipeng
 * @date 2021/5/11
 */
@FunctionalInterface
public interface Comparator<T>{
    int compare(T o1, T o2);

    default void m(){
        System.out.println("m");
    }
}
