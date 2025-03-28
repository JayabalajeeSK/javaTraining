package com.jb.T00CodingExercises;
// RGBColor class representing a color using Red Green Blue (RGB) model.
public class C09RGBColorInvert {
    
    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public C09RGBColorInvert(int red, int green, int blue) {
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    // Getter method to get the red value of the color.
    public int getRed() 
    {
        return this.red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        return this.green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        return this.blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        this.red=255-this.red;
        this.green=255-this.green;
        this.blue=255-this.blue;
        System.out.println(red+","+green+","+blue);
    }
    public static void main(String[] args) {
        C09RGBColorInvert rC09rgbColorInvert=new C09RGBColorInvert(255, 0, 0);
        rC09rgbColorInvert.invert();//255,0,0 -> 0,225,225
    }
}