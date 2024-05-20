package ExceptionHandling.UserDefinedException;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() throws NotValidAgeException {
        if (age < 18) {
            throw new NotValidAgeException("Not valid age");
        }
        System.out.println("My name is" + name + " age is " + age);
    }

}
