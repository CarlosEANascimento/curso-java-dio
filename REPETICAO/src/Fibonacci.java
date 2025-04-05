import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira a quantidade de somas do Fibonacci: ");
        int nTermos = scanner.nextInt();

        System.out.println(fibonacci(nTermos));
    }

    public static int fibonacci (int n){
        int resultado = 0;
        int a1 = 0;
        int a2 = 1;

        for(int i = 1; i < n; i++){
            resultado = a1 + a2;
            a1 = a2;
            a2 = resultado;
        }

        return resultado;
    }
}