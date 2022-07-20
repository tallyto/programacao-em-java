package estudos.tipos_de_dados;

public class NumerosReais {
    public static void main(String[] args) {
        // Por padrao, os numeros reais em Java sao considerados double
        float preco = 23.4f;
        double preco2 = 24.4;

        Float preco3 = 44.5f;
        Double preco4 = 44.5;

        System.out.println("float -> " + preco);
        System.out.println("double -> " + preco2);
        System.out.println("Float -> " + preco3);
        System.out.println("Double -> " + preco4);

        System.out.println("float/Float " + Float.SIZE + " bits");
        System.out.println("double/Double " + Double.SIZE + " bits");

        System.out.println("Valor Min float/Float " + Float.MIN_VALUE);
        System.out.println("Valor Max float/Float " + Float.MAX_VALUE);

        System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
        System.out.println("Valor Max double/Double " + Double.MAX_VALUE);


    }
}
