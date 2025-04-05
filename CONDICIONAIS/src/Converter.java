import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Insira a temperatura a ser convertida: ");
        double temperatura = scanner.nextDouble();

        System.out.println( "\n| Celsius   -> Farenheit | 0 |\n"+
                              "| Farenheit -> Celsius   | 1 |\n"+
                              "| Celsius   -> Kelvin    | 2 |\n"+
                              "| Kelvin    -> Celsius   | 3 |\n"+
                              "| Farenheit -> Kelvin    | 4 |\n"+
                              "| Kelvin    -> Farenheit | 5 |\n");

        System.out.print("Insira a conversão que deseja fazer: ");
        int tipoConversao = scanner.nextInt();

        switch (tipoConversao) {
            case 0: {
                double t = (temperatura * 9/5) + 32;
                System.out.println(temperatura + "°C = " + t + "°F");
                break;
            }
        
            case 1: {
                double t = (temperatura - 32) * 5/9;
                System.out.println(temperatura + "°F = " + t + "°C");
                break;
            }

            case 2: {
                double t = temperatura + 273.15;
                System.out.println(temperatura +"°C = " + t + "K");
                break;
            }

            case 3:{
                double t = temperatura - 273.15;
                System.out.println(temperatura + "K = " + t + "°C");
                break;
            }
            
            case 4:{
                double t = (temperatura - 32) * 5/9 + 273.15;
                System.out.println(temperatura + "°F = " + t + "K");
                break;
            }

            case 5:{
                double t = (temperatura - 273.15) * 9/5 + 32;
                System.out.println(temperatura + "K = " + t + "°F");
                break;
            }
        }
    }
}
