package com.codewithmarco;

import com.codewithmarco.hash.*;
import com.codewithmarco.queue.StackWithTwoQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

//        var arrCountDiff = new int[]{1, 2, 9, 11, 33, 3, 4, 7, 7, 9, 11, 33};
//        var arrTowSum = new int[]{2, 5, 7, 99, 100, 0};
//
//        System.out.println(Arrays.toString(TowSum.findTowSum(arrTowSum, 100)));


        var map = new CustomHashTableWithLinearProbing();
        map.put(5, "5");
        map.put(15, "15");
        map.put(25, "25");
        map.put(1099, "1099");
        map.put(1, "1");

        map.remove(5);
        map.remove(1099);
//        map.put(1, "lbj03");

        System.out.println(map);


    }
}
