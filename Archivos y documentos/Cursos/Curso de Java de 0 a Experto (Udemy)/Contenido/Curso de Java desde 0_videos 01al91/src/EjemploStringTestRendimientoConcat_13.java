public class EjemploStringTestRendimientoConcat_13 {

    public static void main(String[] args) {

        //----------------- de los primeros videos || parte en el video 82 -----------------//

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){

            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2 ms, 1000 => 6ms, 10000 => 103ms, 100000 => 6,534s
            //c += a + b + "\n"; // 500 => 19ms, 1000 => 20ms, 10000 => 83ms, 100000 => 2,381s
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 11ms

        }

        System.gc(); //codigo en el video 82

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        System.exit(0); //codigo en el video 82

    }

}