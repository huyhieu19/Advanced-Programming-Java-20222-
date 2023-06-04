package MidtermReview.Assignment1.Task6;

import java.time.Duration;
import java.time.Instant;

public class Stopwatch {
    public Instant startTime;
    public Instant endTime;

    public Instant getEndTime() {
        return endTime;
    }
    public Instant getStartTime(){
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Stopwatch(){
        startTime = Instant.now();
    }
    public void start(){
        startTime = Instant.now();
    }
    public void stop(){
        endTime = Instant.now();
    }
    public long getElapsedTime(){
        if(startTime != null && endTime != null){
            Duration duration  = Duration.between(startTime, endTime);
            return duration.toMillis();
        }else{
            return 0;
        }
    }
}
