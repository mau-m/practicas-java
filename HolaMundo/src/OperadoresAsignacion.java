public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);

        i += 2; //i = i + 2
        System.out.println("i = "+ i);

        i += 5; // i = i + 5
        System.out.println("i = "+ i);

        j -= 4;
        System.out.println("j = "+ j); // j = j - 4

        j *= 3;
        System.out.println("j = "+ j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Mau'";
        sqlString += " and c.activo = 2";
        System.out.println("sqlString = " + sqlString);

        int a = 10;
        System.out.println("a = "+ a);
        int b = a++; //Primero se devuelve a y luego se incrementa
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        int c = ++a; //Primero se incrementa a y luego se devuelve el resultado
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        int x;
        for(x = 0; x < 5; x++) {
            switch (x++) { //Primero se evalua x y al finalizar la evaluación se incrementa
                case 0:     // al incrementarse en while se evalua en for y se incrementa en for
                    System.out.println("0");                    
                    break;
                case 1:
                    System.out.println("1");                    
                    break;
                case 2:
                    System.out.println("2");                    
                    break;
                case 3:
                    System.out.println("3");                    
                    break;
                default:
                    System.out.println("Default");
                case 5:
                    System.out.println("0");                    
                    break;
            }
        }
    }
}
