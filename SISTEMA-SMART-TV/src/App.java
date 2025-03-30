import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();

        smartTv.showInfos();
        smartTv.turnOn();
        smartTv.channelUp();
        smartTv.volumeUp();
        smartTv.showInfos();

        int newChannel = in.nextInt();
        int newVolume = in.nextInt();

        smartTv.channelChange(newChannel);
        smartTv.volumeChange(newVolume);

        smartTv.showInfos();
    }
}