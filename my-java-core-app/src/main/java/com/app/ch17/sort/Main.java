package com.app.ch17.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {1,0,2,9,3,8,4,7,5,6};
        //Sorter sorter = new BubbleSorter();
        //Sorter sorter = new SelectionSorter();
        //Sorter sorter = new InsertionSorter();
        Sorter sorter = new MergeSorter();
        sorter.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
