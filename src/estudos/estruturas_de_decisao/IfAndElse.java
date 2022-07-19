package estudos.estruturas_de_decisao;

public class IfAndElse {
    public static void main(String[] args) {
        int numero = 2;

         /*
         se(numero > 5) entao {
            escreva("Sim, o numero " + numero + " e maior que 5");
         } senao se (numero == 5) entao {
            escreva("O numero " + numero + " e maior que 5");
         } senao {
            escreva("Nao, o numero " + numero + " nao e maior que 5");
         }
         */
        if (numero > 5) {
            System.out.println("Sim, o numero " + numero + " e maior que 5");
        } else if (numero == 5) {
            System.out.println("O numero " + numero + " e igual 5");
        } else if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e par");
        } else {
            System.out.println("Nao, o numero " + numero + " nao e maior que 5");
        }
    }
}
