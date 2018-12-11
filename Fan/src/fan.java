import org.jetbrains.annotations.Contract;

public class fan {
    private static final int Slow = 1;
    private static final int Medium = 2;
    private static final int Fast = 3;
    private int number = 1;
    private int speed = Slow;
    private boolean on = true;
    private double radius = 5;
    private String color = "Blue";

    private fan(int number, int speed, boolean on, double radius, String color){
        this.number = number;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public  void setNumber(int number){
        this.number = number;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    private void setOn(boolean on){
        this.on = on;
    }

    private void setRadius(double radius){
        this.radius = radius;
    }

    private void setColor(String color){
        this.color = color;
    }

    @Contract(pure = true)
    private int getNumber(){
        return this.number;
    }

    @Contract(pure = true)
    private double getRadius() {
        return this.radius;
    }

    @Contract(pure = true)
    private int getSpeed() {
        return this.speed;
    }

    @Contract(pure = true)
    private boolean isOn() {
        return this.on;
    }

    @Contract(pure = true)
    private String getColor() {
        return this.color;
    }

    public String toString(){
        return "Fan " + getNumber() + " with speed " + getSpeed() + ",radius " + getRadius() + " and color " + getColor() + " is " + (isOn() ? "On" : "Off");
    }


    public static class testFan{
        public static void main(String[] args){
            fan Fan = new fan(1,Fast,true,10,"Yellow");
            System.out.println(Fan);

            Fan = new fan(2,Medium,false,5,"Blue");
            System.out.println(Fan);
        }
    }
}



