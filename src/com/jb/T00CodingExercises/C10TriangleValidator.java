package com.jb.T00CodingExercises;

public class C10TriangleValidator 
{
    public boolean isValidTriangle(int angle1, int angle2, int angle3) 
    {
        int tri=0;
        if(angle1>0 && angle2>0 && angle3>0)
        {
            tri=angle1+angle2+angle3;
            if (tri==180) 
            {
                return true;   
            }
        }
        return false;
    }
    public static void main(String[] args) {
        C10TriangleValidator triangleValidator= new C10TriangleValidator();
        System.out.println(triangleValidator.isValidTriangle(12,90,90));
        System.out.println(triangleValidator.isValidTriangle(60,60,60));
    }
}
// false
// true