public class SmartTv {
    boolean state = false;
    int channel = 1;
    int volume = 25;

    public void showInfos(){
        System.out.println("state: " + state);
        System.out.println("channel: " + channel);
        System.out.println("volume: " + volume);
    }

    public void turnOn(){
        state = true;
    }

    public void turnOff(){
        state = false;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void channelChange(int newChannel){
        channel = newChannel;
    }

    public void volumeChange(int newVolume){
        volume = newVolume;
    }
}
