package S9_DesginPatterns.PenDesign;

public class SlowWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Slow Writing Logic");
    }
}
