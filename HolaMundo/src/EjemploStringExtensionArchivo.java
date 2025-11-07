public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.png";
        int i = archivo.indexOf(".");
        System.err.println("archivo.length() = "+archivo.length());
        System.out.println("archivo.subString(archivo.length() - 4) = "+ archivo.substring(i+1));
    }
}
