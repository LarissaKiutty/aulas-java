public class ResultadoEscolar2 {
    public static void main(String[] args) {
    //Condicional Encadeada   
        int nota = 4;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
