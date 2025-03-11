package com.jb.T12Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;

public class CountChar {

    public static void main(String[] args) {
        String str = "power rangers mystic force" + " "+"SPD Emergency ";
        
        // Counting character occurrences
        Map<Character, Integer> occurance = new HashMap<>();
        char[] characters = str.toCharArray();
        for (char character : characters) {
            Integer integer = occurance.get(character);
            if (integer == null) {
                occurance.put(character, 1);
            } else {
                occurance.put(character, integer + 1);
            }
        }
        System.out.println(occurance);
        // Expected output: { =5, a=1, c=3, D=1, e=5, E=1, f=1, g=2, i=1, m=2, n=2, o=2, p=1, P=1, r=5, s=2, S=1, t=1, w=1, y=2}

        // Counting word occurrences
        Map<String, Integer> strOccurance = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = strOccurance.get(word);
            if (integer == null) {
                strOccurance.put(word, 1);
            } else {
                strOccurance.put(word, integer + 1);
            }
        }
        System.out.println(Arrays.toString(words)); // Displaying words properly
        System.out.println(strOccurance); // Displaying word count
//         [power, rangers, mystic, forceSPD, Emergency]
//         {rangers=1, mystic=1, forceSPD=1, power=1, Emergency=1}

//power rangers mystic force" + " "+"SPD Emergency "
TreeMap<String, Integer> treeMap = new TreeMap<>(strOccurance);
System.out.println(treeMap);
//{Emergency=1, SPD=1, force=1, mystic=1, power=1, rangers=1}
//.ceilingKey(""SPD") >=
//.higherKey(" ") >
//.lowerKey(" ") <
//.floorKey(" ") <=
//.firstEntry()
//.lastEntry()
//.subMap("c","y")
//
//
//
//
    }
}
