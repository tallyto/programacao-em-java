package estudos.tipos_de_dados;

public class NumerosInteiros {
    public static void main(String[] args) {
        // tipos primarios/primitivos
        long num0 = 999999;
        int num1 = 4; // inteiro
        short num2 = 4; // inteiro (curto/menor/baixo)
        byte num3 = 4; // Inteiro
        char num8 = 34;

        // tipos nao primarios
        Integer num4 = 98;
        Short num5 = 99;
        Byte num6 = 9;
        Long num7 = (long) 999999999; // Cast
        Character num9 = 35;

        System.out.println("long -> " + num0);
        System.out.println("int -> " + num1);
        System.out.println("short -> " + num2);
        System.out.println("byte -> " + num3);
        System.out.println("char -> " + num8);

        System.out.println("Long -> " + num7);
        System.out.println("Integer -> " + num4);
        System.out.println("Short -> " + num5);
        System.out.println("Byte -> " + num6);
        System.out.println("Character -> " + num9);

        System.out.println("long/Long " + Long.SIZE + " bits");
        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);

        System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
        System.out.println("Valor Max short/Short " + Short.MAX_VALUE);

        System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Valor Max byte/Byte " + Byte.MAX_VALUE);

        System.out.println("Valor Min long/Long " + Long.MIN_VALUE);
        System.out.println("Valor Max long/Long " + Long.MAX_VALUE);

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); // 65535
    }

}
