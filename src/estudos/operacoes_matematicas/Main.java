package estudos.operacoes_matematicas;

public class Main {

    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;
//        Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

//        Subtracao
        res = num1 - num2;
        System.out.println("A subtracao de " + num1 + " - " + num2 + " é " + res);

//        Multiplicaçao
        res = num1 * num2;
        System.out.println("A multiplicacao de " + num1 + " * " + num2 + " é " + res);

        //        Divisao inteira
        res = num1 / num2;
        System.out.println("A divisao (inteira) de " + num1 + " / " + num2 + " é " + res);

        // Divisão real
        res2 = (float) num1 / (float) num2;
        System.out.println("A divisao real de " + num1 + " / " + num2 + " é " + res2);

//        Módulo
        res = num1 % 2;
        System.out.println("A resto da divisão real de " + num1 + " / " + "2" + " é " + res);


    }
}
