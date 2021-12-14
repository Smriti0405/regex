import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name1 {
    public static void main(String[] args) {
        String str = "namej and niraj neeraj  is not a good boy ";
        Pattern p = Pattern.compile("[nN][a-zA-Z]*[Jj]");
        Matcher m = p.matcher(str);
        if(m.find())
        {
            System.out.println(m.group());
        }
        System.out.println();
    }
}
