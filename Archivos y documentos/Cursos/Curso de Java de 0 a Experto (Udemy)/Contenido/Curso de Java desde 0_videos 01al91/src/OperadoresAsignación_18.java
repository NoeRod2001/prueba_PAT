public class OperadoresAsignación_18 {

    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        System.out.println("i vale = " + i);
        System.out.println("j vale = " + j);

        i += 2; // i = i + 2;
        System.out.println("i ahora vale = " + i);

        i += 5; // i = i + 5;
        System.out.println("i ahora vale = " + i);

        j -= 4; // j = j - 4;
        System.out.println("j ahora vale = " + j);

        j *= 3; // j = j * 3;
        System.out.println("j ahora vale = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Noé'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }

}
