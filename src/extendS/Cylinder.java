package extendS;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getVolume(){
        return (Math.PI*Math.pow(getRadius(),2)*this.height)/3;
    }

    @Override
    public String toString(){
        return "A cylinder with height "
                + getHeight()
                +", which is a subclass A Circle with radius "
                + getRadius()
                +" with color "
                + getColor();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());

        Cylinder cylinder1 = new Cylinder("red",true,5,3);
        System.out.println(cylinder1.toString());
    }
}
