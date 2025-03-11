package com.jb.T12Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map=Map.of("J",2,"A",4,"E",2);
        System.out.println(map); //{A=4, J=2, E=2} m
        System.out.println(map.get("A")); //4
        System.out.println(map.size()); //3
        System.out.println(map.isEmpty()); //false
        System.out.println(map.containsKey("j")); //false
        System.out.println(map.containsValue(4)); //true
        System.out.println(map.keySet()); //[E, A, J] m
        System.out.println(map.values()); //[2, 2, 4] m

        Map<String, Integer> hashMap=new HashMap<>(map);
        System.out.println(hashMap.put("v", 8)); //null - return previous value
        System.out.println(hashMap); //{A=4, J=2, E=2, v=8} - sorted the values im

        Map<String, Integer> linkedHashMap=new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap.put("v", 9)); //8 - return previous value
        System.out.println(linkedHashMap.put("A", 12)); //4 - return previous value
        System.out.println(linkedHashMap.put("B", 19)); //null - return previous value
        System.out.println(linkedHashMap); //{A=12, J=2, E=2, v=9, B=19} - insertion order im

        Map<String, Integer> treeMap=new TreeMap<>(linkedHashMap);
        System.out.println(treeMap.put("z", 18)); //null - return previous value
        System.out.println(treeMap); //{A=12, B=19, E=2, J=2, v=9, z=18} - sorted the values im
    }
}
