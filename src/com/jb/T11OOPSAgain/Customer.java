package com.jb.T11OOPSAgain;
public class Customer 
{
    //state
    private String name;
    private Address homeAddress; // address is another class
    private Address workAddress; // address is another class
    //constructor - behavior
    public Customer(String name, Address homeAddress)
    {
        this.name=name;
        this.homeAddress=homeAddress;
    }
    //action
public Address getHomeAddress() {
    return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
}
public Address getWorkAddress() {
    return workAddress;
}
public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
}
    @Override
public String toString() {
    return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
}
    public static void main(String[] args) {
        Address homeAddress=new Address("plqt", "cpt", "603002");
        Customer customer=new Customer("jaya",homeAddress);
        Address workAddress=new Address("plqt", "erd", "603020");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
// Customer [name=jaya, homeAddress=Address [line1=plqt, city=cpt, zip=603002], workAddress=Address [line1=plqt, city=erd, zip=603020]]