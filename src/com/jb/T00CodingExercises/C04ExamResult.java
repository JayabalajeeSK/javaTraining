package com.jb.T00CodingExercises;
public class C04ExamResult {
    public boolean isPass(int marks) 
    {
        if (marks<=50) 
        {
            return false;            
        }
        else return true;
    }
    public static void main(String[] args) 
    {
        C04ExamResult eC04ExamResult=new C04ExamResult();
        System.out.println(eC04ExamResult.isPass(50));
        System.out.println(eC04ExamResult.isPass(28));
        System.out.println(eC04ExamResult.isPass(98));
    }
}
// false
// false
// true