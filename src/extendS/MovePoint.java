package extendS;

public class MovePoint extends Point {
    private float xSpeed= 0.0f;
    private float ySpeed=0.0f;

    public MovePoint() {
    }

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[]getSpeed = new float[2];
        getSpeed[0]=getxSpeed();
        getSpeed[1]=getySpeed();
        return getSpeed;
    }

    @Override
    public String toString() {
        return "Move point with barycentric "
                +super.getXY()[0]+" "
                +super.getXY()[1]+" speed "
                +getSpeed()[0]+" "+getSpeed()[1];
    }

    public  MovePoint move(){
         super.setX(getX() + this.getxSpeed());
         super.setY(getY()+this.getySpeed());
         return this;
    }

    public static void main(String[] args) {
        MovePoint movePoint =new MovePoint(1,2,2,3);
        System.out.println(movePoint.move());
    }
}
