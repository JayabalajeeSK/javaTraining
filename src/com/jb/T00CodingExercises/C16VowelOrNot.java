package com.jb.T00CodingExercises;
public class C16VowelOrNot {
    public boolean isVowel(char ch) {
        switch (ch) 
        {
            case 'a','e','i','o','u','A','E','I','O','U': return true; // fallthrough and multiple
            default: return false; 
        }
    }
    public static void main(String[] args) {
        C16VowelOrNot c16VowelOrNot=new C16VowelOrNot();
        System.out.println(c16VowelOrNot.isVowel('A'));
    }
}
//true