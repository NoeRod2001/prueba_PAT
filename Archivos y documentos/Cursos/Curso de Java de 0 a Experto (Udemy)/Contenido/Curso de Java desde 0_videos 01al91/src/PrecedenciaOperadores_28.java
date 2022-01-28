public class PrecedenciaOperadores_28 {

    public static void main(String[] args) {

        //---------------videos 48-49---------------//

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("El promedio de [(i + j + k) / 3d] es = " + promedio);

        promedio = (i + j + k) / 3d * 10; // (k / 3d) = 6.66... * 10 = 66.66 + i (14) + j (8) = 88.66
        System.out.println("El promedio de [(i + j + k) / 3d * 10] es = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (13 + 8) + 66.667 = 89.667
        System.out.println("El promedio de [--i + j++ + k / 3d * 10] es = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }

}
