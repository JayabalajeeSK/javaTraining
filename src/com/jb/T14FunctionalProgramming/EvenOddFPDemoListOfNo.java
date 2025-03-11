package com.jb.T14FunctionalProgramming;
import java.util.List;
public class EvenOddFPDemoListOfNo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,7,9);
        list.stream().forEach(
            element -> System.out.println(element)
        );
        filterEven(list);
        filterOdd(list);
    }
    private static void filterOdd(List<Integer>list)
    {
        list.stream()
        .filter(number -> number%2==1)
        .forEach(number -> System.out.println("Odd:"+number)
        );
    }
    private static void filterEven(List<Integer>list)
    {
        list.stream()
        .filter(number -> number%2==0)
        .forEach(number -> System.out.println("Even:"+number)
        );
    }
}
// 1
// 4
// 7
// 9
// Even:4
// Odd:1
// Odd:7
// Odd:9