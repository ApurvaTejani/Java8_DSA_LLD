package GeeksForGeeks.Interface_1;

public class LgTv implements MasterRemote {
    @Override
    public void channelChange() {
        System.out.println("LgTv channelChange....");
    }

    @Override
    public void colorChange() {
        System.out.println("LgTv colorChange....");
    }

    @Override
    public void volumeChange() {
        System.out.println("LgTv volumeChange....");
    }
}
