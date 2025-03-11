// package com.jb.T16ExceptionHandling;
// public class LessCode {
//     public static void main(String[] args) {
//         method1(); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke
//                    // "String.length()" because "str" is null
//         System.out.println("main ended");
//     }

//     static void method1() {
//         method2();// exception
//         System.out.println("med1 ended");
//     }

//     // try - catch
//     private static void method2() {
//         try {
//             int[] i ={1,2};
//             System.out.println(i[2]);
//             String str = null;
//             int len = str.length();
//             System.out.println(len);
//             System.out.println("med2 ended");
//         } 
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println(e);
//         }

//         catch (Exception e) {
//             //System.out.println(e);
//             e.printStackTrace();
//         }

//     }
// }

// // main ended