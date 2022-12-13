public class Problem020 {
    private static char signOfPattern ='*';
    private static char bacground = ' ';
    public static void main(String[] args) {

        waveAdvanced(6,10);
    }
    private static void wave (int numberOfWave){
//        *      *
//         *    *
//          *  *
//           **
        for(int i=0; i<numberOfWave ; i++){
            System.out.print("*      *");
        }
        System.out.println();
        for(int i=0; i<numberOfWave ; i++){
            System.out.print(" *    * ");
        }
        System.out.println();

        for(int i=0; i<numberOfWave ; i++){
            System.out.print("  *  *  ");
        }
        System.out.println();

        for(int i=0; i<numberOfWave ; i++){
            System.out.print("   **   ");
        }
    }

    private static void waveAdvanced (int hight, int width){
        int sizeOfLine= hight*2;

        for(int i =0 ; i<hight ; i++){
            for(int j=0; j<width ; j++){
             // Rysowanie wozru
                for(int n=0; n<sizeOfLine;n++){
                    if (n==i || n == sizeOfLine-i-1) {
                        System.out.print(signOfPattern);
                    }else {
                        System.out.print(bacground);
                    }
                }
            }
            System.out.println();
        }

    }

}
