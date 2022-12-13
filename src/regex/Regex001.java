//Napisz Regex,
//        który dopasowuje ciąg znaków, w który zaczyna się od 'p',
//        po którym następuje cokolwiek, kończąc na 'q'.
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("p.*q");

        tester.validate("p");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("pqqqqrrrrq");
        tester.validate("qqqqq");
        tester.validate("asdfsadf");
    }

}

