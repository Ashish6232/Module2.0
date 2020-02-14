package extendS;

public class Point2D {
    private float x=1.0f;
    private float y=1.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] XY = new float[2];
        XY[0]=x;
        XY[1]=y;
        return XY;
    }

    @Override
    public String toString(){
        return "Point2D with barycentric "
                + getXY()[0]+" "
                + getXY()[1];
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D.toString());
    }
}
