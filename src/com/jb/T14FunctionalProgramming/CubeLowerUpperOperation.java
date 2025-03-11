package com.jb.T14FunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class CubeLowerUpperOperation {
    public static void main(String[] args) {
        IntStream.range(1,11) //1 to 10
        .map(e->e*e*e).forEach(p->System.out.println(p)); //cude 

        List<String> list = List.of("ordered","bat","cat","red");
        list.stream().map(s ->s.toUpperCase()).forEach(s -> System.out.println(s));
        list.stream().map(s ->s.length()).forEach(s -> System.out.println(s));
    }
}
// 1
// 8
// 27
// 64
// 125
// 216
// 343
// 512
// 729
// 1000
// ORDERED
// BAT
// CAT
// RED
// 7
// 3
// 3
// 3
