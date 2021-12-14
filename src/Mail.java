import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|rediff|yahoo)[.]com");
        Matcher m = p.matcher("smritis040_5@gmail.com");
        if(m.find()){
            System.out.println("valid");
            System.out.println(m.group());
        }
        else {
            System.out.println("invalid");
        }
    }
}
