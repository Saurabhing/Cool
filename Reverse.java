//Write a program to reverse a String without using StringBuilder.reverse().
public class Reverse {

    public static void main(String[] args) {
        String string = "Salt";
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < string.length() ; i++) { // string.length count from 1,2,3,4 but the sting store 0,1,2,3
            stringbuilder.append(string.charAt(string.length()-i-1));
        }
        System.out.println(stringbuilder.toString());

    }
}
/*
public class ReverseString {
    public static void main(String[] args) {
        String str = "Salt";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // concatenation
        }
        System.out.println(reversed);
    }
}


public class ReverseString {
    public static void main(String[] args) {
        String str = "Salt";
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        System.out.println(reversed);
    }
}



public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Salt";
        System.out.println(reverse(str));
    }
}


*/
