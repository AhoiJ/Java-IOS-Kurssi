package com.company;

class GraphicalObject {
    protected int X;
    protected int Y;


    public GraphicalObject(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX(){
        return X;
    }
    public void setX( int x){
        X = x;
    }

    public int getY(){
        return Y;
    }

    public void setY(int y){
        Y = y;
    }

    public void setLocation(int x, int y){
        X = x;
        Y = y;
    }

}

class Circle extends GraphicalObject implements Draw{
    private double radius;

    public Circle (int x, int y, double rad){
        super(x,y); // kutsutaan kantaluokan param rak
        radius = rad;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double rad){

        this.radius = rad;
    }

    public double area(){
        double a = Math.PI *  radius * radius;
     //   System.out.println("Area of circle is: " + a);
        return a;
    }

    @Override
    public void drawing() {
        System.out.println("Circles x is: " + X + " and y is: " +
                " and the radius is: " + radius + " and area is: " + area() );
    }
}

class Rectangle extends GraphicalObject implements Draw{
    private double lenght;
    private double width;

    public Rectangle (int x, int y, double lenght, double width){
        super(x,y); // kutsutaan kantaluokan param rak
        this.lenght = lenght;
        this.width = width;
    }
    public double getLenght(){
        return this.lenght;
    }
    public void  setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth( double width){
        this.width = width;
    }

    public double area(){
        double b = lenght * width;
      //  System.out.println("Area of rectangle is: " + b);
        return b;
    }

    @Override
    public void drawing() {
       System.out.println("Rectangles x is: " + X + " y is: " + Y +
               " Width is: " + width + " Lenght is: " + lenght + " area is: " + area());
    }
}

interface Draw{

    void drawing();

}

public class Main{

    public static void main(String[] args){
/*
    GraphicalObject o = new GraphicalObject(1, 2);
 //   System.out.println("X: " + o.getX());
 //   System.out.println("Y: " + o.getY());

    Circle c = new Circle(3,4,25);
    Rectangle r = new Rectangle(5,6,50,12);
 //   System.out.println("Circles area is: " + c.area());
  //  System.out.println("Rectangles area us: " + r.area());
        r.drawing();
        c.drawing();
        */

Draw[] figures = new Draw[10];
for (int i = 0; i < figures.length; i++){
    if ( i % 2 == 0){
        figures[i] = new Circle(i+1, i+2, i+10);
    }
    else
        figures[i] = new Rectangle(i+1, i+2, i+40, i+27);
}
int circleLkm = 0;
int rectangleLkm = 0;
for(Draw p: figures){
    if (p instanceof Circle){
        circleLkm++;
    }
    if (p instanceof Rectangle){
        rectangleLkm++;
    }
    p.drawing();
}
System.out.println("Amount of Circles: " + circleLkm + " Amount of Rectangles: " + rectangleLkm);
    }

}
