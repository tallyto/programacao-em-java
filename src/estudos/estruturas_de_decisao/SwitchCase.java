package estudos.estruturas_de_decisao;

public class SwitchCase {
    public static void main(String[] args) {
        int numero = 54;
        switch (numero) {
            case 1:
                System.out.println("O numero e 1");
                break;
            case 3:
                System.out.println("O numero e 3");
                break;
            case 5:
                System.out.println("O numero e 5");
                break;
            default:
                System.out.println("[Default] O numero e " + numero);
                break;
        }
    }
}
