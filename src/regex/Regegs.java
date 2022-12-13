package regex;


import java.awt.*;
import java.util.logging.SocketHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regegs {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("Tekst w którym szykam test");

        // dopasowanie do całego tekstu w którym szukamy
        System.out.println(matcher.matches());

        //metoda find -> czy jest pasujacy fragment
        System.out.println(matcher.find());

        // szuka kolejnego dopasowania
        System.out.println(matcher.find());  // <- wypisze false dlatego że znacznik pozostaje w ostatnim miejscu gdzie
                                            // gdzie było ostatnie znalezienie.
// Resetuje wskaźńik
        matcher.reset();
// Poprawnie wyszuka funkacją find.
        System.out.println(matcher.find());
    }
}
