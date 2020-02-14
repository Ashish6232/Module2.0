package abstractClassAndInterface1;

import extendS.Circle;

import java.util.Arrays;

public class CirCleComparable extends Circle implements Comparable<CirCleComparable> {

    public CirCleComparable(){

    }

    public CirCleComparable(double radius) {
        super(radius);
    }

    public CirCleComparable(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(CirCleComparable o) {
        if (getRadius()> o.getRadius()){
            return 1;
        } else if (getRadius()<o.getRadius()){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        CirCleComparable[] circle = new CirCleComparable[3];
        circle[0]= new CirCleComparable(5);
        circle[1]=new CirCleComparable(3.5);
        circle[2]=new CirCleComparable(4);

        System.out.println("Pre-sorted");
        for (CirCleComparable cirCleComparable:circle) {
            System.out.println(cirCleComparable);
        }

        Arrays.sort(circle);

        System.out.println("After-sorted");
        for (CirCleComparable cirCleComparable:circle) {
            System.out.println(cirCleComparable);
        }

        CirCleComparable cirCleComparable = new CirCleComparable();
        System.out.println(cirCleComparable.compareTo(circle[1]));
    }
}
