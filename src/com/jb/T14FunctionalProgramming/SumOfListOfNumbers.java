package com.jb.T14FunctionalProgramming;
import java.util.List;
public class SumOfListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,7,9,5,8);
        numbers.stream().forEach(element -> System.out.println(element));
        getSumNormal(numbers);
        getSumFP(numbers);
    }
    private static void getSumFP(List<Integer>list)
    {
       int sum = list.stream()
        .reduce(0,(number1, number2) -> number1+number2);
        System.out.println("FP sum: "+sum);
    }
    private static void getSumNormal(List<Integer> numbers) {
        int sum=0;
        for(int number:numbers)
        {
            sum=sum+number;
        }
        System.out.println("Total: "+sum);
    }    
}
// 1
// 4
// 7
// 9
// 5
// 8
// Total: 34
// FP sum: 34