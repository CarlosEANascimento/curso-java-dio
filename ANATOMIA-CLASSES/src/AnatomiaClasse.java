public class AnatomiaClasse {
    public static void main(String[] args) {

        final String CONSTANTE = "constante"; //final <tipo> <NOME EM MAIUSCULO> = <valor imutavel>
        String variavelNormal = "variavel normal"; //<tipo> <nomeEmCamelCase> = <valor mutavel ou nao inicializacao>
        
        String string1 = "A";
        String string2 = "B";

        System.out.println(CONSTANTE);
        System.out.println(variavelNormal);

        String strings = identacaoString(string1, string2);
        System.out.println(strings);
    }   

    public static String identacaoString(String str1, String str2){
        // return str1 + " " + str2;
        //ou 
        return str1.concat(" ").concat(str2);
    }
}