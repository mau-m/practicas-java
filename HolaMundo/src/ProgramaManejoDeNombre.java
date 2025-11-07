import java.util.Scanner;

public class ProgramaManejoDeNombre {
    public static void main(String[] args) {
        if(args.length == 3) {
            Scanner sn = new Scanner(System.in);
            String cadena = "";
            for(int i=0; i<3; i++) {
                String nombre = args[i];
                int nombreLength = nombre.length();
                cadena += nombre.substring(1, 2).toUpperCase() + "." + nombre.substring(nombreLength - 2, nombreLength) + "_";
            }
            System.out.println(cadena);
        }
    }
}
