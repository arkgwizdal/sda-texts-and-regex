/*
Napisz regex,
który znajdzie tekst, w którym po jednej dużej literze następują małe litery.
 */
package regex;

public class Regex002 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]+");

        tester.validate("P");
        tester.validate("Pq");
        tester.validate("PqqqQ");
        tester.validate("Aqqqqrrrrq");
        tester.validate("qqqqQQQQq");
        tester.validate("asdfsadf");
    }
}
