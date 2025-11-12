public class OperadorTernario {
    public static void main(String[] args) {
        //variable = condicion ? si es verdadero : si es falso;
        String variable = 7 == 7 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = "+ variable);

        String estado = "";
        double promedio = 6.2;
        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.err.println("estado = " + estado);

        //Operador instanceof
        String texto = "Esto es un texto";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = "+b1);

        // error de sintaxis, no tienen relaciones uno y otro
        // boolean b2 = texto instanceof Integer
        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object");

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = "+b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = "+b1);
    }
}
