//Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (https://pl.wikipedia.org/wiki/Szyfr_Cezara)
//        Tekst jawny: MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG
//        Tekst zaszyfrowany: OGBPA DCFB, EJTQP RWNM VYQL K UBGUE HNCI


public class Porblem022 {
    public static void main(String[] args) {
        String encryptedTxt = encrypt("MEznY BaDZ, CHRON PULK TWOJ I SZESC FLAG@@##123", 2);

        System.out.println(encryptedTxt);
    }

    private static String encrypt(String text, int key) {
        text = text.toUpperCase();
        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                int characterIndex = currentCharacter - (char) ('A');
                int characterShifted = (characterIndex + key) % 26 + (char) ('A');
                encrypted += ((char) (characterShifted));
            } else {
                encrypted += currentCharacter;
            }
        }
        return encrypted;
    }

//    private static String encrypt(String text, int key) {
//        text = text.toUpperCase();
//        String encrypted = "";
//
//        for (int i = 0; i < text.length(); i++) {
//            char currentCharacter = text.charAt(i);
//
//            if (Character.isUpperCase(currentCharacter)) {
//
//                //przeliczamy znak na liczbe z zakresu 0-25   (-65)
//                int characterIndex = currentCharacter - (char) 'A';
//                int characterShifted = characterIndex + key;
//
//                if (characterShifted > 25) {
//                    // korekcja powrotu do zakresu 0 - 25
//                    characterShifted = characterShifted - 26;
//                }
//                // to inaczej mozna zapisac characterShifted= characterShifted % 26;
//
//                //wracamy do ASCII
//                characterShifted = characterShifted + (char) 'A';
//
//                encrypted += (char) characterShifted;
//            } else {
//                //czyli w przypadku jak to nie była litera
//                encrypted += currentCharacter;
//            }
//        }
//
//        return encrypted;
//    }
}