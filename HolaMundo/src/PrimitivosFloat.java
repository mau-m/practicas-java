public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12e3f;
        System.out.println("realDouble = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo float corresponde en byte a " + Double.BYTES);
        System.out.println("tipo float corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo de un float: " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un float: " + Double.MIN_VALUE);
    }
}
