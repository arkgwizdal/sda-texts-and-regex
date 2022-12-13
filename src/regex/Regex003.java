package regex;

public class Regex003 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}");

        tester.validate("258523985239");
        tester.validate("694970001");
        tester.validate("594970001");
        tester.validate("+48594970001");
        tester.validate("qqqqQQQQq");
        tester.validate("asdfsadf");
    }
}
