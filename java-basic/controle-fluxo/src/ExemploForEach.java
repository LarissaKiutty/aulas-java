public class ExemploForEach {
    public static void main(String[] args) {
         
        String alunos[] = {
            "Felipe",
            "Lucas",
            "Gabriel",
            "João",
            "Carlos"
        };

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }   
    }
}
