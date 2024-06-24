public class Operadores {
  public static void main(String[] args) {
    
// Sobre concatenação    
    //String nomeCompleto = "Larissa" + "de Souza";
    
    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);
    
    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);
    
    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);
    
    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);
    
    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(concatenacao);


// Sobre Incrementação e conversão
    int numero = 5;
    numero = - numero;
    System.out.println(++numero);

// Negando Expresões Booleanas
    boolean variavel = true;
    variavel = !variavel;
    System.out.println(variavel);

// Usando condicionais

    int a, b;
    a = 5;
    b = 6;
    String resultado = "";

// if else

    if(a == b) {
      resultado = "verdadeiro";
    } else {
      resultado = "falso";
    }

    System.out.println(resultado);

// Exemplo com Ternário
    resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);
  }
}
