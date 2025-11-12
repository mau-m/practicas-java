import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        //String productos[] = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Memoria Ram 16GB 3200Mhz",
                "Tarjeta Madre B550", "Tarjeta de video RTX 5060ti", "Fuente de Poder 750W",
                "Procesador Ryzen 7 5700x", "SSD 1TB"};

        int total = productos.length;

        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Memoria Ram 16GB 3200Mhz";
        productos[2] = "Tarjeta Madre B550";
        productos[3] = "Tarjeta de video RTX 5060ti";
        productos[4] = "Fuente de Poder 750W";
        productos[5] = "Procesador Ryzen 7 5700x";
        productos[6] = "SSD 1TB";
        */

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : " + productos[i]);
        }

        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+(total - 1 - i)+" : " + productos[total-1-i]);
        }

        System.out.println("=== Usando for inverso 2 ===");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para indice "+i+" : " + productos[i]);
        }
    }
}
