package MidtermReview.Assignment1.Task2;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = true;
    public TV(){

    }
    public void turnOn(){
        if(on == false){
            on = true;
        }
    }
    public void turnOff(){
        if(on == true){
            on = false;
        }
    }

    public void setChannel(int newChannel){
        if(newChannel > 0 && newChannel <=120 && on == true){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolume){
        if(newVolume > 0 && newVolume <=120 && on == true){
            volumeLevel = newVolume;
        }
    }

    public void channelUp(){
        if(channel < 120 && on == true){
            channel ++;
        }else if(channel == 120 && on == true){
            channel = 0;
        }
    }
    public void channelDown(){
        if(channel > 1 && on == true){
            channel --;
        }else if(channel == 1 && on == true){
            channel = 120;
        }
    }
    public void volumeUp(){
        if(volumeLevel < 7){
            volumeLevel ++;
        }
    }
    public void volumeDown(){
        if(volumeLevel > 1){
            volumeLevel --;
        }
    }

    public void main(String[] args){
        TV tv = new TV();

    }

}
