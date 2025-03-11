package com.jb.T14FunctionalProgramming;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class MaxMin {
       public static void main(String[] args) {
       List <Integer> var1 = List.of(1, 4, 7, 9, 5, 8);
       int max=var1.stream().max((n1,n2) -> Integer.compare(n1, n2)).get(); 
       int min=var1.stream().min((n1,n2) -> Integer.compare(n1, n2)).get(); 
       System.out.println("Max: "+max);
       System.out.println("Min: "+min);
       List<Integer> sq=IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList());
       System.out.println(sq); //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
    }
}
// Max: 9
// Min: 1
