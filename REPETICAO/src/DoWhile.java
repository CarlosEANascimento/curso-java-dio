import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n;
        boolean par = false;

        do{
            System.out.print("Insira um valor par: ");
            n = scanner.nextInt();

            if(n % 2 == 0){
                par = true;
            }else{
                System.out.println("Valor inserido foi impar.");
            }
        }while(!par);
    }
}
