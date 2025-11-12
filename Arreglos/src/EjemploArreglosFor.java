import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String productos[] = new String[7];

        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Memoria Ram 16GB 3200Mhz";
        productos[2] = "Tarjeta Madre B550";
        productos[3] = "Tarjeta de video RTX 5060ti";
        productos[4] = "Fuente de Poder 750W";
        productos[5] = "Procesador Ryzen 7 5700x";
        productos[6] = "SSD 1TB";

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : " + productos[i]);
        }

        System.out.println("=== Usando foreach ===");
        for (String prod : productos) {
            System.out.println("prod = "+ prod);
        }

        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < total) {
            System.out.println("para indice "+i+" : " + productos[i]);
            i++;
        }

        System.out.println("=== Usando do while ===");
        int j = 0;
        do {
            System.out.println("para indice "+j+" : " + productos[j]);
            j++;
        } while(j < total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for(int k=0; k < totalNumeros; k++){
            System.out.println("numeros = "+ numeros[k]);
        }
    }
}
