package com.jb.T19_JavaTips;
class Client
{
    private int id;
    public Client(int id) {
    	super();
        this.id = id;
    }
    
}
public class EqualsAndHashCodeRunner {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(2);
        Client c3 = new Client(1);
        System.out.println(c1.equals(c2)); // inhert object class
        System.out.println(c1.equals(c1)); // compers object
        System.out.println(c1.equals(c3));

        
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
// false
// true
// false