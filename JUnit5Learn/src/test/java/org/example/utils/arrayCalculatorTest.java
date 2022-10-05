package org.example.utils;

import org.example.utils.arrayCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class arrayCalculatorTest {

    @Test
    void addUsingIntegerArrays() {
        arrayCalculator calc=new arrayCalculator();
        int [] res=calc.add(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4});
        assertArrayEquals(res,new int[]{2,4,6});
    }

    @Test
    void UsingArrayList(){
        arrayCalculator calc=new arrayCalculator();
        ArrayList<Integer> arr1=new ArrayList<Integer>(3);
        ArrayList<Integer> arr2=new ArrayList<Integer>(4);
        ArrayList<Integer> ans=new ArrayList<Integer>(3);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        ans.add(2);
        ans.add(4);
        ans.add(6);
        ArrayList<Integer> res=calc.add(arr1,arr2);
        assertIterableEquals(res,ans,"compare two array lists");
    }
}