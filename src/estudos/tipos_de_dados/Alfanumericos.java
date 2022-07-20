package estudos.tipos_de_dados;

//Tipos de dados alfanumericos
//caracteres e strings
public class Alfanumericos {
    public static void main(String[] args) {
        // tipos primitivos
        char letra = 'a'; // Aspas simples
        char letra2 = 97; // 97 em decimal == 'a'
        letra2 = (char) (letra2 + 1);
        // string nome = "asdf"; Nao existe o tipo primitivo string em Java

        System.out.println("Letra " + letra);
        System.out.println("Letra2 " + letra2);

        // tipos nao primitivos
        Character letra3 = 'A';
        String nome = "Tallyto";

        System.out.println("Letra3 " + letra3);

        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); // 65535

        System.out.println("Nome: " + nome);
        System.out.println("Tamanho da string " + nome.length());
        System.out.println("String " + Character.SIZE * nome.length() + " bits");

    }
}
