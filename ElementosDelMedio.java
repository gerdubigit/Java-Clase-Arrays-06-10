import java.util.Arrays;

public class ElementosDelMedio {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4};
        if (arrayOriginal.length >= 3) {
            int nuevaLongitud = arrayOriginal.length - 2;
            int[] arrayDelMedio = new int[nuevaLongitud];
            for (int i = 1; i < arrayOriginal.length - 1; i++) {
                arrayDelMedio[i - 1] = arrayOriginal[i];
            }
            System.out.println("Array original: " + Arrays.toString(arrayOriginal));
            System.out.println("Array del medio: " + Arrays.toString(arrayDelMedio));
        } else {
            System.out.println("El array debe tener al menos 3 elementos.");
        }
    }
}
