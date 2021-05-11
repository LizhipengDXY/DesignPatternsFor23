package com.lanpo.design.strategy;

/**
 * @author li zhipeng
 * @date 2021/5/11
 */
public class CatWeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.weight < o2.weight) return -1;
        else if(o1.weight > o2.weight) return 1;
        else return 0;
    }
}
