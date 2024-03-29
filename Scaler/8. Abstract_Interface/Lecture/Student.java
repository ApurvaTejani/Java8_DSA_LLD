public class Student implements Comparable<Student> {
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    public int compareTo(Student o) {
        return (this.marks - o.marks);

    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
    }

}
