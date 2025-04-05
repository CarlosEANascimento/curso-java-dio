import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira a nota do aluno >");
        double nota = scanner.nextDouble();

        System.out.print("Situação: ");
        if(nota <= 3.0){
            System.out.println("Reprovado.");
        }else if(nota < 5.0){
            System.out.println("Recuperação.");
        }else{
            System.out.println("Aprovado.");
        }

        // ou

        String resultado = nota < 5.0 ? "Reprovado" : "Aprovado" ;
        System.out.println("Situação: " + resultado);
    }
}