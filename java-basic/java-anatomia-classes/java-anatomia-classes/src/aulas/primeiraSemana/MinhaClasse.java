package aulas.primeiraSemana;
public class MinhaClasse {
  public static void main(String [] args) {

    String primeiroNome = "Kiukiu";
    String segundoNome = "Meiko";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "My name is " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
