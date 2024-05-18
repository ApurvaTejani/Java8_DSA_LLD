
// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"

public class StringBit {
    public static void main(String[] args) {
        System.out.println(stringBits("Naina"));
    }
    public static String stringBits( String str){
char[] letters = str.toCharArray();
char[] newletters = new char[letters.length];
int j=0;
for(int i=0;i<letters.length;i++){
    if(i%2==0)
    {
        newletters[j]= letters[i];
        j++;
    }
}
String str1 = String.valueOf(newletters).trim();
return str1;
    }
}
