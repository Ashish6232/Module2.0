package extendS;

public class Ractangle extends Shape{
    private double width =1.0;
    private double height = 1.0;

    public Ractangle(){

    }

    public Ractangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public Ractangle(String color,boolean filled,double width, double height){
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width =width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return 2*(this.width+this.height);
    }

    @Override
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        System.out.println(ractangle.toString());
    }
}
