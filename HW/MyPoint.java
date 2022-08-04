package com.company.OOP;

public class MyPoint {

    private int x=0;
    private int y=0;


    public MyPoint(){

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int arr[]={this.x,this.y};
        return arr;
    }

    public void setXY(int x , int y){
        setX(x);
        setY(y);
    }


    public double distance(int x , int y){
        // √(xA − xB)2 + (yA − yB)2
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    public double distance(MyPoint myPoint){
        // √(xA − xB)2 + (yA − yB)2
        return Math.sqrt(Math.pow(this.x-myPoint.getX(),2)+Math.pow(this.y-myPoint.getY(),2));
    }

    public double distance(){
        // √(xA − xB)2 + (yA − yB)2
        return Math.sqrt(Math.pow(this.x-0,2)+Math.pow(this.y-0,2));
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
