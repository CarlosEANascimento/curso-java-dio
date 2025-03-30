import java.util.Locale;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("<nome: ");
        String nome = scanner.next();

        System.out.print("<sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("<idade: ");
        int idade = scanner.nextInt();

        System.out.println("Inputs dadas:");
        System.out.println(">nome: " + nome);
        System.out.println(">sobrenome: " + sobrenome);
        System.out.println(">idade: " + idade);
    }
}