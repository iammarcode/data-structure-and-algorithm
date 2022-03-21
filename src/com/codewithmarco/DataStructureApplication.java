package com.codewithmarco;

import com.codewithmarco.hash.CountPairWithDiff;
import com.codewithmarco.hash.CustomHashTable;
import com.codewithmarco.hash.FindMostFrequent;
import com.codewithmarco.hash.RepeatFinder;
import com.codewithmarco.queue.StackWithTwoQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 9, 11, 33, 3, 4, 7, 7, 9, 11, 33};


        System.out.println(CountPairWithDiff.count2(arr, 2));

    }
}
