package oop;

public class Fan {
   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST =3;
   private int speed = SLOW;
   private boolean on =false;
   private double radius =5;
   private String color = "blue";

   public Fan(){
   }

   public Fan(int speed, boolean on, double radius, String color) {
      this.speed = speed;
      this.on = on;
      this.radius = radius;
      this.color = color;
   }

   public void setOn(boolean on){
      this.on=on;
   }
   public boolean getOn(){
      return this.on;
   }

   public void setSpeed(int speed,int choice){
      this.speed=speed;
   }

   public int getSpeed(){
      return this.speed;
   }

   public void setRadius(double radius){
      this.radius=radius;
   }

   public double getRadius(){
      return this.radius;
   }

   public void setColor(String color){
      this.color=color;
   }

   public String getColor(){
      return this.color;
   }

   public String toString(){
      if (this.on==false) {
         return MEDIUM+" color "+getColor() + " radius "+getRadius() + " fan is off";
      } else {
         return FAST+" speed "+getSpeed()+ " color "+getColor()+" radius "+getRadius()+" fan is on ";
      }
   }
   public static void main(String[] args) {
      Fan fan1 = new Fan(10, true, 10, "yellow");
      System.out.println("fan1 has "+fan1.toString());
      Fan fan2 = new Fan(5,false,5,"blue");
      System.out.println("fan2 has "+fan2.toString());
   }
}