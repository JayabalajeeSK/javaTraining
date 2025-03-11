package com.jb.T00CodingExercises;
public class C08DistanceBw2Points {
    private int x;
    private int y;
     int y2;
    public C08DistanceBw2Points(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void move(int dx, int dy) 
    {
        this.x=this.x+dx;
        this.y=this.y+dy;
        System.out.println(x+","+y);
    }

    public double distanceTo(C08DistanceBw2Points other) 
    {
        int diffx=this.x-other.x;
        int diffy=this.y-other.y;
        return Math.sqrt(diffx*diffx+diffy*diffy);
    }
    public static void main(String[] args) {
        C08DistanceBw2Points distanceBw2Points1=new C08DistanceBw2Points(3, 4);
        C08DistanceBw2Points distanceBw2Points2=new C08DistanceBw2Points(6, 8);
        System.out.println(distanceBw2Points1.distanceTo(distanceBw2Points2)); //5.0
        distanceBw2Points1.move(1, 1); //4,5
        System.out.println(distanceBw2Points1.distanceTo(distanceBw2Points2)); //3.605551275463989
    }
}