package bai1;
public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");

        System.out.println("Create Fan 1: Fan fan1 = new Fan(Fan.FAST, true, 10, \"yellow\");");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 1 speed: " + fan1.getSpeed());
        System.out.println("Fan 1 setSpeed to Medium");
        fan1.setSpeed(Fan.MEDIUM);
        System.out.println("Fan 1 speed: " + fan1.getSpeed());
        System.out.println("------------------------");

        System.out.println("Fan 1 On or Of: " + fan1.isOn());
        System.out.println("Fan 1 Set to off");
        fan1.setOn(false);
        System.out.println("Fan 1 isOn: " + fan1.isOn());
        System.out.println("------------------------");

        System.out.println("Fan 1 radius: " + fan1.getRadius());
        System.out.println("Fan1 setOn = true and Fan 1 Set radius = 15");
        fan1.setOn(true);
        fan1.setRadius(15);
        System.out.println("Fan 1 Radius: " + fan1.getRadius());
        System.out.println("------------------------");

        System.out.println("Fan 1 Color: " + fan1.getColor());
        System.out.println("Fan 1 Set coler to red");
        fan1.setColor("red");
        System.out.println("Fan 1 color: " + fan1.getColor());
        System.out.println("------------------------");


        System.out.println("Create Fan 2: Fan fan2 = new Fan(Fan.MEDIUM, false, 5, \"blue\"); ");
        System.out.println("Fan 2: " + fan2.toString());

    }
}