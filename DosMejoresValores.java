import java.util.Arrays;

public class DosMejoresValores {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 10, 7, 1};
        int[] dosMejores = obtenerDosMejoresValores(numeros);

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Dos mejores valores: " + Arrays.toString(dosMejores));
    }
    
    public static int[] obtenerDosMejoresValores(int[] array) {
        int[] dosMejores = new int[2];
        if (array.length < 2) {
            System.out.println("El array debe tener al menos dos elementos.");
            return dosMejores;
        }
        
        dosMejores[0] = array[0];
        dosMejores[1] = array[1];
            
        for (int i = 2; i < array.length; i++) {
            if (array[i] > dosMejores[0]) {
                dosMejores[1] = dosMejores[0];
                dosMejores[0] = array[i];
            } else if (array[i] > dosMejores[1] && array[i] != dosMejores[0]) {
                dosMejores[1] = array[i];
            }
        }
        
        return dosMejores;
    }
}
