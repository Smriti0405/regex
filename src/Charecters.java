import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Charecters {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher("fth");
        if (m.find())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
