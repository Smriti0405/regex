import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobileno {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employees mobile number");
        String num = s.next();
        System.out.println("Enter name");
        String name = s.next();
        Pattern p = Pattern.compile("(91|0)?[7-9][0-9]{9}");
        Pattern p1 = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher("num");
        Matcher m1 = p1.matcher("name");
        if (m.find()) {
            System.out.println(name);
            System.out.println("valid");

        }
        else {
            System.out.println(name);
            System.out.println("invalid");
        }
    }
}
