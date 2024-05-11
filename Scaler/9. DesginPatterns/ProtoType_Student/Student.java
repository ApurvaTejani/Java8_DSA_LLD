public class Student {
    private String name;
    public int age;

    public Student() {
    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
