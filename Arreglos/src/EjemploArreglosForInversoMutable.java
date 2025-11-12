import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        //String productos[] = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Memoria Ram 16GB 3200Mhz",
                "Tarjeta Madre B550", "Tarjeta de video RTX 5060ti", "Fuente de Poder 750W",
                "Procesador Ryzen 7 5700x", "SSD 1TB"};

        int total = productos.length;

        //Arrays.sort(productos);
        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : " + productos[i]);
        }

    }
}
