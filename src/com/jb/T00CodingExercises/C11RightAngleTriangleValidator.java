package com.jb.T00CodingExercises;

public class C11RightAngleTriangleValidator {
    public boolean isRightAngled(int side1, int side2, int side3) 
    {
        if(side1<=0 || side2<=0 || side3<=0)
        {
            return false;
        }
            
            int lhs1=side1*side1+side2*side2;
            int lhs2=side2*side2+side3*side3;
            int lhs3=side3*side3+side1*side1;
            
            int rhs1=side3*side3;
            int rhs2=side1*side1;
            int rhs3=side2*side2;
            if(lhs1==rhs1)
            {
                return true;
            }
            if(lhs2==rhs2)
            {
                return true;
            }
            if(lhs3==rhs3)
            {
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        C11RightAngleTriangleValidator c11RightAngleTriangleValidator=new C11RightAngleTriangleValidator();
        System.out.println(c11RightAngleTriangleValidator.isRightAngled(3, 4, 6));
        System.out.println(c11RightAngleTriangleValidator.isRightAngled(3, 4, 5));
    }
}
// false
// true