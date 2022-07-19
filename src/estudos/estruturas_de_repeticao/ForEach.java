package estudos.estruturas_de_repeticao;

public class ForEach {
    public static void main(String[] args) {
        String nome = "Tallyto";

        //Para cada um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
        }
    }
}
