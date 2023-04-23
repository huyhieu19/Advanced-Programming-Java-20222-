package bai1;
/* +--------------------------------+
|               Fan               |
+---------------------------------+
| - speed: int                    |
| - on: boolean                   |
| - radius: double                |
| - color: String                 |
|---------------------------------|
| + SLOW: int = 1                 |
| + MEDIUM: int = 2               |
| + FAST: int = 3                 |
|---------------------------------|
| + Fan()                         |
| + Fan(speed: int, on: boolean,  |
|   radius: double, color: String)|
| + getSpeed(): int               |
| + setSpeed(speed: int): void    |
| + isOn(): boolean               |
| + setOn(on: boolean): void      |
| + getRadius(): double           |
| + setRadius(radius: double): void|
| + getColor(): String            |
| + setColor(color: String): void |
| + toString(): String            |
 +--------------------------------+
*/
public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(on == true){
            this.speed = speed;
        }
    }

    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }
}