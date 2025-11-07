public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = "+suma);

        System.out.println("i + j = "+ i + j);
        System.out.println(i + j + " i + j = ");
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;
        float div2 = (float) i / j; //(float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("modulo = "+resto);
    }
}
