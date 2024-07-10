public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {
            "Felipe",
            "Gabriel",
            "João",
            "Lucas",
            "Maria"
        };

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice = " + x + " é " + alunos[x]);
        }
    }
}
