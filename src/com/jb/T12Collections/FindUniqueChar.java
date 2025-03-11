package com.jb.T12Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class FindUniqueChar {
    public static void main(String[] args) {
        List<Character> characters=List.of('j','A','Y','a','B','a','L','A');
        Set<Character> treeSet= new TreeSet<>(characters);
        
        System.out.println(treeSet); //[A, B, L, Y, a, j] //unique and sorted
        Set<Character> hashSet= new HashSet<>(characters);
        System.out.println(hashSet); //A, a, B, Y, j, L] //unique but not sorted (randomly sort)
        Set<Character> linkedHashSet= new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet); //A, a, B, Y, j, L] //unique but same order (insertion order)  
    }
}