package WarmUp_2;// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

// altPairs("kitten") → "kien" 
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

// ====Completed=====
public class altParis {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
    }

    public static String altPairs(String str) {
        int j = 0;
        int z = 0;
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        String strArr[] = new String[str.length() - 1];
        for (int i = 0; i < strArr.length; i = i + 2) {
            strArr[j] = str.substring(i, i + 2);// 0,2 2,4
            j++;
        }

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[z] = strArr[i];
                z++;
            }
        }
        String str1 = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null)
                str1 = str1.concat(strArr[i]);
        }

        if (!(str1.length() + 1 == str.length()))
            if (str.length() % 2 == 1) {
                str1 = str1 + str.charAt(str.length() - 1);
            }

        return str1;
    }
}
