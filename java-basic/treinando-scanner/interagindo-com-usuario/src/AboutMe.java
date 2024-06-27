import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        MinhaClasse pessoa = new MinhaClasse();

        System.out.println("Informe sua altura: ");
        pessoa.altura = scanner.nextDouble();

        System.out.println("Informe seu nome: ");
        pessoa.name = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        pessoa.lastName = scanner.next();

        System.out.println("Informe sua idade: ");
        pessoa.idade = scanner.nextInt();

    }
}
