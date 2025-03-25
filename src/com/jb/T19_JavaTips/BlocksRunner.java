package com.jb.T19_JavaTips;
public class BlocksRunner {
    public static void main(String[] args) {
        if(3>2)
            System.out.println("3>2");
        {
            int i =0;
            System.out.println("Inside Block i: " + i);
        }
        //System.out.println("Outside Block i" +i);
    }
}
// 3>2
// Inside Block i: 0