import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    public static void main(String[] args) {
        String names = "Smriti Srivastava";
        Pattern p = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher(names);
        int a=0;
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
            a++;
        }
        System.out.println(a);
    }
}
