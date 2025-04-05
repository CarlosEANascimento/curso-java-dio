public class BreakEContinue {
    public static void main(String[] args) {
        int arrInt [] = {1,2,3,4,5,6};

        for(int i = 0; i < arrInt.length; i++){
            if( arrInt[i] % 2 == 0 ){
                System.out.println(arrInt[i]);
                break;
            }
        }

        for(int i = 0; i < arrInt.length; i++){
            if(arrInt[i] % 2 == 0) {
                continue;
            }
            System.out.println(arrInt[i]);
        }
    }
}