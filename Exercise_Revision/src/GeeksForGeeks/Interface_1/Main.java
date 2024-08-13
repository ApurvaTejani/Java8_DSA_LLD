package GeeksForGeeks.Interface_1;

public class Main {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            MasterRemote m = (MasterRemote) c.newInstance();
            m.channelChange();
            m.colorChange();
            m.volumeChange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
