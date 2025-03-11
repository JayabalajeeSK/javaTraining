package com.jb.T12Collections;
import java.util.Set;
import java.util.TreeSet;
public class NavigableSet {
    public static void main(String[] args) {
        TreeSet<Integer> number= new TreeSet<>(Set.of(65,54,34,12,99));
        System.out.println(number.floor(34)); //number<=34 -- 34
        System.out.println(number.lower(34)); //number<34 -- 12
        System.out.println(number.ceiling(34)); //number>=34 -- 34
        System.out.println(number.higher(34)); //number>34 -- 54
        System.out.println(number.subSet(12, 65)); //start>= , end before<(not included) -- [12, 34, 54]
        System.out.println(number.subSet(12,true, 65,true)); //start>= , end before<=(included) -- [12, 34, 54, 65]
        System.out.println(number.headSet(54));//before that element, but that elements not included -- [12, 34]
        System.out.println(number.tailSet(54));//after that element, that element also included -- [54, 65, 99]
    }
}
