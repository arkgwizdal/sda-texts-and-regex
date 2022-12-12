public class Problem021 {
    public static void main(String[] args) {

        isPalindrom("aktagenerałamamałarenegatka");

    }

    private static void isPalindrom (String text){
        text.toLowerCase();
        int isPalindrom =1;
        for(int i =0; i<text.length(); i++ ){

            if (text.charAt(i) != (text.charAt(text.length()-i-1))){
                isPalindrom = 0;
            }
            }
       if (isPalindrom==1){
           System.out.println("TO JEST PALNDROM !!!");
       }else {
           System.out.println("TO NIE JEST PALNDROM  :( ");
        }

    }
}
