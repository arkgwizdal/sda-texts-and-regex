public class Problem020 {
    public static void main(String[] args) {

        wave(5);
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

//    private static void waveAdvanced (int hight, int width){
//
//        for(int i =0 ; i<hight ; i++){
//
//            for(int j =0)
//
//        }
//
//    }

}
