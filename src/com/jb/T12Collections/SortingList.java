package com.jb.T12Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(21,3,78,9);
        List<Integer> numbersAL= new ArrayList<>(numbers);
        System.out.println(numbersAL); //[21, 3, 78, 9]
        Collections.sort(numbersAL);
        System.out.println(numbersAL); //[3, 9, 21, 78]
    }
}
