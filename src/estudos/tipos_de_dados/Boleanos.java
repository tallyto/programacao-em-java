package estudos.tipos_de_dados;

// Tipos booleanos
public class Boleanos {
    public static void main(String[] args) {
        // Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;
//        Tipos não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);

        System.out.println("V " + v);
        System.out.println("F " + f);

        if (verdadeiro) {
            System.out.println("É Verdadeiro");
        } else {
            System.out.println("É falso");
        }
    }
}
