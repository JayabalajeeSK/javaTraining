package com.jb.T12Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
    public static void main(String[] args) {
    Set <String> set=Set.of("apple","banana","cat");
    System.out.println(set); //[apple, cat, banana] m
    Set<String> hashSet = new HashSet<>(set);
    System.out.println(hashSet); //[banana, apple, cat] m
    Set<Integer> numbers = new HashSet<>();
    numbers.add(765432);
    numbers.add(76543);
    numbers.add(7654);
    numbers.add(765);
    numbers.add(76);
    System.out.println(numbers); //[765432, 7654, 76, 765, 76543] m
    System.out.println(hashSet); //[banana, apple, cat] m
    
    Set<Integer> numbers1 = new LinkedHashSet<>();
    numbers1.add(765432);
    numbers1.add(76543);
    numbers1.add(7654);
    numbers1.add(765);
    numbers1.add(76);
    System.out.println(numbers1); //[765432, 76543, 7654, 765, 76] im

    Set<Integer> numbers2 = new TreeSet<>();
    numbers2.add(765432);
    numbers2.add(76543);
    numbers2.add(7654);
    numbers2.add(765);
    numbers2.add(76);
    System.out.println(numbers2); //[76, 765, 7654, 76543, 765432] sorted and no duplicates
    }
}
