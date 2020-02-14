package accessModifier;

public class Circle {
    private double radius=1.0;
    private String color ="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println("Circle has radius: "+ circle.getRadius());
        System.out.println("Circle has area: "+circle.getArea());

        Circle circle2 =new Circle(5);
        System.out.println("Circle has radius: "+circle2.getRadius());
        System.out.println("Circle has area: "+circle2.getArea());
    }


}
