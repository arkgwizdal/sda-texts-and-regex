package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {
    private Pattern pattern;

    public RegexTester(String patternAssign){
        this.pattern = Pattern.compile(patternAssign);

    }
    public void validate(String text) {
        Matcher macher = pattern.matcher(text);
        if (macher.matches()) {
            System.out.println("Prawda dla testu : " + text);
        } else {
            System.out.println("Fałsz dla testu : " + text);
        }
    }
}
