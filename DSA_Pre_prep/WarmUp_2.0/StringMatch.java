
// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("abc", "abc")); // xx xc ca aa az zz
    }
    public static int stringMatch(String a, String b)
    {
        int count =0;
        if(a.isEmpty() || b.isEmpty()){
            return 0;
        }
        String []a1= new String[a.length()-1];
        String []b1= new String[b.length()-1];
        for (int i=0;i<(a.length()-1);i++){
         a1[i]=a.substring(i,i+2);
        }
        for (int i=0;i<(b.length()-1);i++){
         b1[i]=b.substring(i,i+2);
        }
        for(int i=0;i<Math.min(a1.length, b1.length);i++)
        {
        if(a1[i].equals(b1[i]))
        {
            count++;
        }
    }
        return count;
        }
        

    }

