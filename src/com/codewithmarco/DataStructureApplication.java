package com.codewithmarco;

import com.codewithmarco.hash.CustomHashTable;
import com.codewithmarco.hash.FindMostFrequent;
import com.codewithmarco.hash.RepeatFinder;
import com.codewithmarco.queue.StackWithTwoQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        int[] arr = new int[]{1,1,2,2,2,2,3,4,4,4,4,4,7};

        System.out.println(FindMostFrequent.mostFrequent2(arr));

    }
}
