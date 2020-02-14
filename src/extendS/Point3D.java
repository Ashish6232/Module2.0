package extendS;

public class Point3D extends Point2D {
    private float z=1.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.getXY();
        this.z=z;
    }

    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0]=getX();
        XYZ[1]=getY();
        XYZ[2]=getZ();
        return XYZ;
    }

    @Override
    public String toString(){
        return "Point3D witd barycentric "
                + getXYZ()[0]+" "+getXYZ()[1]+" "+getXYZ()[2]
                +", which is a subclass of "
                +super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D =new Point3D(6);
        System.out.println(point3D.toString());
    }
}
