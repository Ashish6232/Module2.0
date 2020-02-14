package extendS;

public class Point {
    private float x= 1.0f;
    private float y = 1.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[]XY = new float[2];
        XY[0]=getX();
        XY[1]=getY();
        return XY;
    }

    @Override
    public String toString() {
        return "A point with barycenteric "
                +getXY()[0]+" "+getXY()[1];
    }

    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point.toString());
    }
}
