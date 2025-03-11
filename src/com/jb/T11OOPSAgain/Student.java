package com.jb.T11OOPSAgain;
public class Student extends Employee
{
    private String college;
    private int year;

    
    public Student(String name, String college) {
        super(name, college);
        this.college=college;
        System.out.println("Student Constructor");
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        Employee employee=new Employee("jaya","ASE");
        //employee.setName("jaya");
        employee.setMail("jaya04@gmail.com");
        employee.setEmployeeName("bala");
        employee.setPhoneNumber("8072");
        employee.setEmployeeGrade('A');
        employee.setTitle("ASE");
        System.out.println(employee);
        // Person [name=jaya, mail=jaya04@gmail.com, phoneNumber=8072] Employee [title=ASE, employeeName=bala, employeeGrade=A,]

        // Employee [title=ASE, employeeName=bala, employeeGrade=AEmail: jaya04@gmail.comname: jaya,]
        // Student student=new Student();
        // student.setName("jaya");
        // student.setMail("jaya04@gmail.com");
        // System.out.println(student.getName());//jaya
        // Person person=new Person();
        // String value=person.toString();
        // System.out.println(person); //com.jb.T11OOPSAgain.Person#5b275dab
        // System.out.println(value); //com.jb.T11OOPSAgain.Person#5b275dab
    }
}
//Person Constructor
//Employee Constructor
//Person [name=jaya, mail=jaya04@gmail.com, phoneNumber=8072] Employee [title=ASE, employeeName=bala, employeeGrade=A,]