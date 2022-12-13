package regex;

public class Regex005 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-ZŻŁ][a-z]+");
        tester.validate("Łukasz");
        tester.validate("Bartosz");
        tester.validate("olek");
        tester.validate("Kanye");
        tester.validate("Bielsko-Biala");
        tester.validate("Bielsko-Biała");
        tester.validate("Ptysiow123");
        tester.validate("warszawa");

        RegexTester tester1 = new RegexTester("([A-Z][a-z]+)?(van der Leyen( [A-Z][a-z]+)?)?(de Silva)?([A-Z][a-z]+\\-[A-Z][a-z]+)?");
        tester1.validate("de Silva");
        tester1.validate("van der Leyen");
        tester1.validate("Bachleda-Curus");
        tester1.validate("Zielona Gora");
        tester1.validate("Bielsko-Biala");
        tester1.validate("Bielsko-Biała");
        tester1.validate("Ptysiow123");
        tester1.validate("warszawa");
    }

}
