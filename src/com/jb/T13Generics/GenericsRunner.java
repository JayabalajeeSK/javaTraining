package com.jb.T13Generics;
public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list=new MyCustomList<>();
        list.addElement("Element-1");
        list.addElement("Element-2");
        String text = list.get(0);
        System.out.println(text);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(9));
        Integer num = list2.get(1);
        System.out.println(num);

    }
}
