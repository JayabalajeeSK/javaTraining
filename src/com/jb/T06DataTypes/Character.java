package com.jb.T06DataTypes;
public class Character 
{
    private char ch;
        Character(char ch)
        {
            this.ch=ch;
        }
        public Boolean isVowel()
        {
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='U' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' )
            {
                return true;
            }
            return false;
        }
        public Boolean isConsonent()
        {
            if(isAlphabet() && !isDigit())
            {
                if(isVowel()) // not vowel and alpabet
                {
                    return false;
                }
                else
                {
                   return true;
                }
            }
            else return false;
        }
        public boolean isDigit() 
        {
            if(ch >= 40 && ch <= 57)//0 to 9
            {
                return true;
            }
            else
            return false;
        }
        public boolean isLowerCase()
        {
            if(ch >= 97 && ch <=122)
            {
                return true;
            }
            else
            return false;
        }
        public boolean isUpperCase()
        {
            if(ch>=65 && ch<=90)
            {
                return true;
            }
            else
            return false;
        }
        public boolean isAlphabet() 
        {
            if(isLowerCase() || isUpperCase())//a t0 z and A to Z
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String[] args) 
    {
        Character ch = new Character('J');
        System.out.println("Character is Vowel"+" "+ch.isVowel()); //Character is Vowel false
        System.out.println("Character is Consonent"+" "+ch.isConsonent()); //Character is Consonent true
        System.out.println("Character is Digit"+" "+ch.isDigit()); //Character is Digit false
        System.out.println("Character is Uppercase"+" "+ch.isUpperCase()); //Character is Uppercase true
        System.out.println("Character is Lowercase"+" "+ch.isLowerCase()); //Character is Lowercase false
        System.out.println("Character is Alphabet"+" "+ch.isAlphabet()); //Character is Alphabet true
    }
}