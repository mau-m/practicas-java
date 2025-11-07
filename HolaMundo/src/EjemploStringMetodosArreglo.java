import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = "+trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for(int i = 0; i<largo; i++) {
            System.out.printf("arreglo[%d] = %s\n", i, arreglo[i]);
        }

        for(char a : arreglo) {
            System.out.println(a);
        }

        String[] otroArreglo = trabalenguas.split("a");
        for(String b : otroArreglo) {
            System.out.println(b);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split(".");
        String[] archivoArr2 = archivo.split("\\.");
        String[] archivoArr3 = archivo.split("[a]");
        System.out.println(archivoArr.length);
        System.out.println(archivoArr2.length);
        System.out.println(archivoArr3.length);
    }
}
