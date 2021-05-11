package com.lanpo.interface1_8;

/**
 * @author li zhipeng
 * @date 2021/5/12
 */
public interface IWalk {
     default void walk(){
        System.out.println("IWalk walk");
    }
}
