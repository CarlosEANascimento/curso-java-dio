public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 27.0;
        double valorSolicitado = 25.0;

        if(valorSolicitado > saldo){
            System.out.println("Transação cancelada. Saldo insuficiente (R$"+ saldo +")");
        }else{
            saldo -= valorSolicitado;
            System.out.println("Tansação concluída com sucesso. (novo saldo: R$"+ (saldo) +")");
        }
    }
}
