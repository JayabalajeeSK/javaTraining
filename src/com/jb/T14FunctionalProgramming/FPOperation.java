package com.jb.T14FunctionalProgramming;

import java.util.List;

public class FPOperation {
     public static void main(String[] args) {
        List<Integer> numbers = List.of(3,55,7,8,24,31,4,47,9,54,18);
        numbers.stream().forEach(element -> System.out.println(element));
        numbers.stream().sorted().forEach(sortE -> System.out.println("sorted :"+sortE));
        numbers.stream().distinct().forEach(disE -> System.out.println("Distinct :"+disE));
        numbers.stream().distinct().sorted().forEach(disSortE -> System.out.println("Distinct sorted:"+disSortE));
        numbers.stream().distinct().sorted().forEach(disSortE -> System.out.println("Distinct sorted:"+disSortE));
        numbers.stream().distinct().sorted().map(sqE -> sqE*sqE).forEach(sqE-> System.out.println(" Square Distinct sorted:"+sqE));
     }
}
// 3
// 55
// 7
// 8
// 24
// 31
// 4
// 47
// 9
// 54
// 18
// sorted :3
// sorted :4
// sorted :7
// sorted :8
// sorted :9
// sorted :18
// sorted :24
// sorted :31
// sorted :47
// sorted :54
// sorted :55
// Distinct :3
// Distinct :55
// Distinct :7
// Distinct :8
// Distinct :24
// Distinct :31
// Distinct :4
// Distinct :47
// Distinct :9
// Distinct :54
// Distinct :18
// Distinct sorted:3
// Distinct sorted:4
// Distinct sorted:7
// Distinct sorted:8
// Distinct sorted:9
// Distinct sorted:18
// Distinct sorted:24
// Distinct sorted:31
// Distinct sorted:47
// Distinct sorted:54
// Distinct sorted:55
// Distinct sorted:3
// Distinct sorted:4
// Distinct sorted:7
// Distinct sorted:8
// Distinct sorted:9
// Distinct sorted:18
// Distinct sorted:24
// Distinct sorted:31
// Distinct sorted:47
// Distinct sorted:54
// Distinct sorted:55
//  Square Distinct sorted:9
//  Square Distinct sorted:16
//  Square Distinct sorted:49
//  Square Distinct sorted:64
//  Square Distinct sorted:81
//  Square Distinct sorted:324
//  Square Distinct sorted:576
//  Square Distinct sorted:961
//  Square Distinct sorted:2209
//  Square Distinct sorted:2916
//  Square Distinct sorted:3025