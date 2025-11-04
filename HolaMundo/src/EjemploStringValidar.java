public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = "H";

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.isEmpty();

        boolean esBlanco = curso.isBlank();

        if (!esVacio && !esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }
        
    }
}
