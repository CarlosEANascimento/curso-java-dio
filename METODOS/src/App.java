public class App {
    public static void main(String[] args) throws Exception {
        double soma = somar(1.00,1.00);
        double divisao = dividir(4,2);

        System.out.println("1.00+1.00="+soma);
        System.out.println("4/2="+divisao);
        imprimir("texto");

    }

    public static double somar(double n1, double n2){                      //metódo público, posso acessar ele de qualquer parte do sistema. returna um valor do tipo double.
        return n1 + n2;
    }

    public static void imprimir(String texto){                             //metódo público, posso acessar ele de qualquer parte do sistema. não tem nenhum retorno, portanto, void.
        System.out.println(texto);
    }

    public static double dividir(int n1, int n2) throws Exception {        //throws exception indica que o metódo por vir a ter exceções.
        if(n2 == 0){
            throw new Exception ("Divisão por 0");          //aqui eu retorno a exceção. não precisa ser do mesmo tipo do retorno do metódo.
        }

        return n1/n2;
    }

    /*
    private static void imprimirPrivado(String texto){                     //só pode ser usado na classe em que foi criado, neste caso, na classe App
        System.out.println(texto);
    }
    */
}