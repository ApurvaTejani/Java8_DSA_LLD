package S1_Intro_to_OOPS.Lecture;

public class Client {
    public static void main(String[] args) {
        Student st; // ref

        st = new Student();
        // st.age = 10;
        st.setAge(10);
        // st.name = "ABC";
        st.setName("ABC");

        st.display();
    }
}
