import java.util.*;

public class Token {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        getToken(s);
    }

    public static void getToken(String s){
        //constraints
        //regex
        //split - regex
        //print # of tokens
        //print array
        String regexString = "[A-Za-z +!,?._'@]+";
        if(s.matches(regexString)){
            if(s.length()>= 1 && s.length()<=4*Math.pow(10,5)){
                String regex = "[ !,?._'@$]+";
                s = s.trim();
                if(s.length()>0){
                    String[] tokens = s.split(regex);
                    System.out.println(tokens.length);
                    for (String each:tokens){
                        System.out.println(each);
                    }
                }else{
                    System.out.println("0");
                }

            }
        }

    }
}