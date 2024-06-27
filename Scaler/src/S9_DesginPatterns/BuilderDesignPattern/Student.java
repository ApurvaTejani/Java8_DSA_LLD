package S9_DesginPatterns.BuilderDesignPattern;

import java.util.function.Predicate;
// Student
// 1. 4 private dm
// 2. 4 public getters
// 3. private ctor that takes builder and only sets (no validations)
// 4. public static getBuilder to help clients get a builder object
// 5. static inner class called Builder

// Builder
// 1. 4 private dm
// 2. 4 setters that return builder again
// 3. private ctor of Builder
// 4. builderMethod = has validations before doing a new Student(this)
public class Student {
    private String name;
    private int age;
    private int psp;
    private long phoneNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", phoneNo=" + phoneNo +
                '}';
    }

    // 4 getters -- not showing
    private Student(Builder b) {
        this.name = b.name;
        this.age = b.age;
        this.psp = b.psp;
        this.phoneNo = b.phoneNo;

    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        private static String name;
        private static int age;
        private static int psp;
        private static long phoneNo;

        private Builder() {

        }

        public Student builderMethod() {
            if (!isNameValid.test(name))
                throw new IllegalArgumentException("Name is not valid");
            if (!isAgeValid.test(age))
                throw new IllegalArgumentException("Age is not valid");
            if (!isPsPValid.test(psp))
                throw new IllegalArgumentException("PSP is not valid");
            if (!isPhoneNoValid.test(phoneNo))
                throw new IllegalArgumentException("Phone no is not valid");

            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        //Predicates and validations
        static Predicate<String> isNameValid = name -> (name != null && name.length() != 0 && name.length() < 100);
        static Predicate<Integer> isAgeValid = age -> (age >= 15 && age <= 50);

        static Predicate<Integer> isPsPValid = psp -> (psp >= 0 && psp <= 100);

        static Predicate<Long> isPhoneNoValid = pno -> (pno.toString().length() == 8);
    }
}
