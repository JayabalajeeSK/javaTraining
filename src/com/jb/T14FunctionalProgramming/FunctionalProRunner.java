package com.jb.T14FunctionalProgramming;
import java.util.List;
public class FunctionalProRunner {
    public static void main(String[] args) {
        List<String> list = List.of("ordered","bat","cat","red");
        //printBasic(list);
        printWithFP(list);
        printWithFiltering(list);
        printWithFilteringWithFP(list);
    }
    // private static void printBasic(List<String> list) {
    //     for(String string:list)
    //     {
    //         System.out.println(string);
    //     }
    // }
    // instead of loop, we streaming through each element
    private static void printWithFP(List<String> list) {
        list.stream().forEach(
            element -> System.out.println(element)
        );
    }

    private static void printWithFiltering(List<String> list) {
        for(String string: list)
        {
            if(string.endsWith("at"))
            {
                System.out.println("elemernt end with at:"+string);
            }
        }
    }
    private static void printWithFilteringWithFP(List<String> list) {
        list.stream()
        .filter(elemnt -> elemnt.endsWith("red"))
        .forEach(element -> System.out.println("element end with red:" +element)
        );
    }
}
// ordered
// bat
// cat
// red
// elemernt end with at:bat
// elemernt end with at:cat
// element end with red:ordered
// element end with red:red