import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        if(a.length()==b.length() && a.length()>=1 && a.length()<=50){
            for(int i=0; i<a.length(); i++){
                char[] char1 = a.toLowerCase().toCharArray();
                char[] char2 = b.toLowerCase().toCharArray();

                Arrays.sort(char1);
                Arrays.sort(char2);

                return (Arrays.equals(char1,char2));
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
