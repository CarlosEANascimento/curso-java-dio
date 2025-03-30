import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Cliente cliente = new Cliente();

        System.out.print("Insira seu nome: ");
        cliente.nome = scanner.nextLine();

        System.out.print("Insira sua agência: ");
        cliente.agencia = scanner.next();

        System.out.print("Insira o número de sua conta:");
        cliente.numero = scanner.nextInt();

        System.out.println("Olá "+ cliente.nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ cliente.agencia +", conta "+ cliente.numero +" e seu saldo R$"+ cliente.saldo +" já está disponível para saque");
    }
}
