public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Larissa Kiutty";
        
        double salarioMinimo = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 4; - Não permite a alteração de valor já que final é a forma de se declarar uma constante em Java
    }
}
