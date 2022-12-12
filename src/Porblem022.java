public class Porblem022 {
    public static void main(String[] args) {

        String encryptedText ="MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG";
        encryptCezar(encryptedText,2);
        System.out.println(encryptedText);

    }

    private static String encryptCezar (String inputText, int key){
        inputText = inputText.toUpperCase();
        String outputText = "";
        int numberText=0;
        for (int i =0; i < inputText.length(); i++){
            numberText = inputText.charAt(i);
            if (numberText>=65 || numberText <= 90 ) {
                if ( (numberText+key )

                outputText.charAt(i) = (char) (numberText + key);

            }

        }
        return outputText;

    }

    private static void decipherCezar (String inputText){

    }

}
