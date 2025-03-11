package com.jb.T11OOPSAgain;
public class Person extends Object
{
    private String name;
    private String mail;
    private String phoneNumber;
    public Person(String name) {
        super();
        System.out.println("Person Constructor");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", mail=" + mail + ", phoneNumber=" + phoneNumber + "]";
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args) {
    }
}