package MidtermReview.Assignment3;


public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius;
    String color = "white";

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public Fan(){
        this.color = "white";
        this.on = false;
        this.radius = 5;
        this.speed = SLOW;
    }

    public String toString(Fan fan){
        if(fan.on == true){
            return "Fan on: true, speed: " + fan.speed + ", color: " + fan.color;
        }else{
            return "Fan on: false, speed: " + fan.speed + ", color: " + fan.color;
        }
    }
}
