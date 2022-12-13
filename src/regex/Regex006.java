/*
Napisz program, który pobiera od użytkownika tekst i sprawdza, czy w podanym tekście wystąpiła data
w formacie YYYY-MM-DD.
Jeśli tak to wypisz tę datę, jeśli nie to wypisz że w tekście nie ma daty
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        Pattern datePattern = Pattern.compile(".*(\\d{4}-([0]\\d)?(1[0-2])?-([0-2][0-9])?(30|31)?).*");
        Matcher matcher = datePattern.matcher(userInput);
        if(matcher.matches()){
            System.out.println("W tekście jest poprawna data : "+matcher.group(1));
        }else{
            System.out.println("Brak poprawnej daty w teksćie ");
        }

    }



}
