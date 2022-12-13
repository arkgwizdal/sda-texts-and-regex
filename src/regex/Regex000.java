//Napisz Regex,
//        który dopasowuje ciąg znaków, w którym po 'p' występuje
//        zero lub więcej 'q'
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex000 {
    private static final Pattern pattern = Pattern.compile("pq*");

    public static void main(String[] args) {
        validate("p");
        validate("pq");
        validate("pqqqq");
        validate("pqqqqrrrrr");
        validate("qqqqq");
        validate("asdfsadf");
    }

//    public static void main(String[] args) {
//        Pattern pattern =  Pattern.compile("pq*");
//        Matcher matcher = pattern.matcher("p");
//        Matcher matcher1 = pattern.matcher("pqqqq");
//
//        System.out.println(matcher.matches());
//        System.out.println(matcher1.matches());
//    }
//

    private static void validate(String text) {
        Matcher macher = pattern.matcher(text);
        if (macher.matches()) {
            System.out.println("Prawda dla testu : " + text);
        } else {
            System.out.println("Fałsz dla testu : " + text);
        }
    }
}
