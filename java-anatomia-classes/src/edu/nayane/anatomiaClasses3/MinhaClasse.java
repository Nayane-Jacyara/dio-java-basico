package edu.nayane.anatomiaClasses3;

public class MinhaClasse {

    public static void main(String[] args) {
      String primeiroNome = "Nayane";
      String segundoNome = "Jacyara";

      String nomeCompleto = nomeComplento(primeiroNome, segundoNome);

      System.out.print(nomeCompleto);
    }
 
    public static String nomeComplento(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
