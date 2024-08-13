package GeeksForGeeks.Interface_1;

public class SamsungTv implements MasterRemote {
    public void channelChange() {
        System.out.println("SamsungTv channelChange....");
    }

    public void colorChange() {
        System.out.println("SamsungTv colorChange....");
    }

    public void volumeChange() {
        System.out.println("SamsungTv volumeChange....");
    }
}
