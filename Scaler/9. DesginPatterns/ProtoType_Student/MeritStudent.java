public class MeritStudent extends Student {
    public int scholarship;

    public MeritStudent() {

    }

    public MeritStudent(MeritStudent ms) {
        super(ms);
        this.scholarship = ms.scholarship;
    }

    public MeritStudent clone() {
        return new MeritStudent(this);
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
