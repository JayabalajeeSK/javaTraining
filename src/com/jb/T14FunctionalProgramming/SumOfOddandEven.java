package com.jb.T14FunctionalProgramming;

import java.util.List;

public class SumOfOddandEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,7,9,5,8);
        numbers.stream().forEach(element -> System.out.println(element));
        getOddSumFP(numbers);
        getEvenSumFP(numbers);
    }
    private static void getOddSumFP(List<Integer>list)
    {
       int sum = list.stream()
       .filter(number -> number%2==1)
       .reduce(0,(number1, number2) -> number1+number2);

        System.out.println("FP Odd sum: "+sum);
    }
    private static void getEvenSumFP(List<Integer>list)
    {
       int sum = list.stream()
       .filter(number -> number%2==0)
       .reduce(0,(number1, number2) -> number1+number2);
        System.out.println("FP even sum: "+sum);
    }
}
// 1
// 4
// 7
// 9
// 5
// 8
// FP Odd sum: 22
// FP even sum: 12