package estudos.estruturas_de_decisao;

public class OperadorTernario {
    public static void main(String[] args) {
        int valor = -3, numero;

        /*if (valor > 0) {
            numero = valor;
        } else {
            numero = 7;
        }*/

        numero = (valor > 0) ? valor : 7;
        System.out.println(numero);
    }
}
