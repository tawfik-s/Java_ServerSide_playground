package org.example.utils;

import java.util.ArrayList;

public class arrayCalculator {


    public int[] add(int[]arr1,int[]arr2){
        int[] res=new int[Math.min(arr1.length,arr2.length)];
        for(int i=0;i<Math.min(arr1.length,arr2.length);i++){
            res[i]= arr1[i]+ arr2[i];
        }
        return res;
    }
    public ArrayList<Integer> add(ArrayList<Integer> arr1,ArrayList<Integer>arr2){
        ArrayList<Integer> res=new ArrayList<Integer>(Math.min(arr1.size(),arr2.size()));
        for(int i=0;i<Math.min(arr1.size(),arr2.size());i++){
            res.add(i, arr1.get(i) + arr2.get(i));
        }
        return res;
    }
}
