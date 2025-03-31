package com.marco;

import com.marco.hash.CountPairWithDiff;


public class DataStructureApplication {
    public static void main(String[] args) {

        var arr = new int[]{1, 7, 5, 9, 2, 12, 3, 3};
        var k = 2;

        System.out.println(CountPairWithDiff.countUnique(arr, k));
        System.out.println(CountPairWithDiff.countRepeat(arr, k));

    }
}
