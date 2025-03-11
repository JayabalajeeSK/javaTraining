package com.jb.T16ExceptionHandling;
public class CheckedExceptionRunner {
    public static void main(String[] args) {
        try {
            riskyMethod();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void riskyMethod() throws InterruptedException {
        Thread.sleep(5000);
    }
}