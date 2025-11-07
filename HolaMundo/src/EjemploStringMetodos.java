public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Mauricio";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase = "+nombre.toUpperCase());
        System.out.println("nombre.toLowerCase = "+nombre.toLowerCase());
        System.out.println("nombre.equals(\"Mauricio\") = " + nombre.equals("Mauricio"));
        System.out.println("nombre.equals(\"mauricio\") = " + nombre.equals("mauricio"));
        System.out.println("nombre.equalsIgnoreCase(\"mauricio\") = "+nombre.equalsIgnoreCase("mauricio"));
        System.out.println("nombre.compareTo(\"Mauricio\") = " + nombre.compareTo("Mauricio"));
        System.out.println("nombre.compareTo(\"Mauricio\") = " + nombre.compareTo("Mau"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.subString(1) = " + nombre.substring(1));
        System.out.println("nombre.subString(1,4) = "+nombre.substring(1,4));

        String otraPalabra = "otraPalabra";
        System.out.println("otraPalabra = "+otraPalabra.replace("a", "A"));
        System.out.println("otraPalabra = " + otraPalabra);
        System.out.println("otraPalabra.indexOf('a') = " + otraPalabra.indexOf('a'));
        System.out.println("otraPalabra.lastIndexOf('a') = " + otraPalabra.lastIndexOf('a'));
        System.out.println("otraPalabra.indexOf('alabra') = " + otraPalabra.indexOf("alabra"));
        System.out.println("otraPalabra.contains('Palabra') = "+otraPalabra.contains("Palabra"));
        
    }
}
