public class CaixaEletronico {
    public static void main(String[] args) {
    // Condicional Simples  
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso! Seu saldo atua é de " + saldo);
        }
    }
}
