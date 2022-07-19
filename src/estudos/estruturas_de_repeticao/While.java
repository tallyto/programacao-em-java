package estudos.estruturas_de_repeticao;

import java.util.Scanner;

// Receba dados do usuario enquanto a idade for maior que 0
public class While {
    public static void main(String[] args) {
        // Para receber dados do usuario via teclado
        int idade = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);

        while (idade > 0) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            // idade = teclado.nextInt(); bug
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos");
        }
        teclado.close();

    }
}
