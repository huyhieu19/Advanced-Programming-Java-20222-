package MidtermReview.Assignment2;

import java.util.Calendar;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        Calendar now = Calendar.getInstance();
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);

    }
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public static void main(String[] args) {
        // Tạo đối tượng Time biểu diễn thời gian hiện tại
        Time currentTime = new Time();

        // In ra thời gian hiện tại
        System.out.println("Thời gian hiện tại:");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());

        // Tạo đối tượng Time biểu diễn thời gian đã trôi qua
        Time elapsedTime = new Time(5555550000L);

        // In ra thời gian đã trôi qua
        System.out.println("Thời gian đã trôi qua:");
        System.out.println("Hour: " + elapsedTime.getHour());
        System.out.println("Minute: " + elapsedTime.getMinute());
        System.out.println("Second: " + elapsedTime.getSecond());

        // Tạo đối tượng Time với thời gian được chỉ định
        Time customTime = new Time(10, 30, 45);

        // In ra thời gian tùy chỉnh
        System.out.println("Thời gian tùy chỉnh:");
        System.out.println("Hour: " + customTime.getHour());
        System.out.println("Minute: " + customTime.getMinute());
        System.out.println("Second: " + customTime.getSecond());
    }
}
