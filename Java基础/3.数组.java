package com.kai;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public void Test()
    {
        //声明
        int[] arr = new int[100];
        int[] arr2 = {1,2,3,0};
        double [][]d = new double[10][11];

        //copy
        int[] arr3 = Arrays.copyOf(arr2,arr2.length);
        int[] arr4 = Arrays.copyOfRange(arr2,2,3);

        //sort
        Arrays.sort(arr3);

        //binary search
        int index = Arrays.binarySearch(arr3,1);

        //to string
        System.out.println(Arrays.toString(arr3));

        //赋值
        for(int i = 0;i<arr.length;i++){
            arr[i] = i;
        }
        //foreach
        for(int i:arr){
            //System.out.println(i);
        }

    }
}
