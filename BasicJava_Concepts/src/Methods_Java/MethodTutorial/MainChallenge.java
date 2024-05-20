package Methods_Java.MethodTutorial;

public class  MainChallenge {
    public static void main(String[] args) {
       int age =20;
       methodDoes(age);
    }

    public static void methodDoes(int age) {
        if(age<21)
        {
            return;
        }
        age+=100;
        System.out.println(age);
    }
}
