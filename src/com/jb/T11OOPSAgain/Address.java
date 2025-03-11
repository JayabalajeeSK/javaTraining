package com.jb.T11OOPSAgain;
public class Address {
    //state
    private String line1;
    private String city;
    private String zip;
    //behavior
    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    
    }
    @Override
    public String toString() {
        return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
    }
    
    
    
}

