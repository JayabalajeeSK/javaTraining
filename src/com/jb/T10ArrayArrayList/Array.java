package com.jb.T10ArrayArrayList;
import java.util.Arrays;
public class Array 
{
    public static void main(String[] args) 
    {
        int [] arr1 = new int[5];
        int [] arr2 = {1,2,3,4,5,6};
        arr1[0]=1;
        arr1[1]=19;
        arr1[2]=13;
        arr1[3]=12;
        arr1[4]=14;
        System.out.println(arr1);
        for(int element:arr1)
        {
            System.out.println(element);
        }
        for(int i=arr2.length;i>=arr2[0];i--)
        {
            System.out.println(i); 
        }
        System.out.println(Arrays.toString(arr2)); //[1, 2, 3, 4, 5, 6]
    }
}
// 1
// 19
// 13
// 12
// 14
// 6
// 5
// 4
// 3
// 2
// 1