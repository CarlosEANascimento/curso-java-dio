public class Argumentos{
    public static void main(String[] args) {
        String name = args[0];
        String lastName = args[1];
        int yearsOld = Integer.valueOf(args[2]);

        System.out.println("nome: " + name);
        System.out.println("sobrenome: " + lastName);
        System.out.println("idade: " + yearsOld);
    }
}