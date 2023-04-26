package Assignment1;

public class TV {
	int channel;
	int volumeLevel;
	boolean on;
	public TV(int channel, int volumeLevel, boolean on) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}
	public void turnOn() {
		if(!on) {
			on=true;
		}
	}
	public void turnOff() {
		if(on) {
			on=false;
		}
	}
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	public void setVolume(int newVolumeLevel) {
		if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	public void channelUp() {
		if(on && channel <120) {
			channel = channel++;
		}
	}
	public void channelDown() {
		if(on && channel > 1) {
			channel = channel--;
		}
	}
	public void volumeUp() {
		if(on && volumeLevel <7) {
			volumeLevel=volumeLevel++;
		}
	}
	public void volumeDown() {
		if(on && volumeLevel > 1) {
			volumeLevel=volumeLevel--;
		}
	}

}
