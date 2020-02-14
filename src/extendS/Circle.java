package extendS;

import javax.xml.bind.SchemaOutputResolver;

public class Circle extends Shape {
    private double radius=0.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

   public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
   }

   public void setRadius(double radius){
        this.radius=radius;
   }

   public double getRadius(){
        return this.radius;
   }

   public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
   }

   public double getPerimeter(){
        return 2*this.radius*Math.PI;
   }

   @Override
    public String toString(){
        return "A circle width radius "
                + getRadius()
                +", which is a subclass of "
                +super.toString();
   }

    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle.toString());

        Circle circle1 = new Circle("red",true,5);
        System.out.println(circle1.toString());
    }

}
