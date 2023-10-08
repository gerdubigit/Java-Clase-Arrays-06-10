import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminarDuplicados {
    public static void main(String[] args) {
        int[] arregloOriginal = {1, 1, 2, 2, 3, 4, 5};
        
        int[] arregloSinDuplicados = eliminarDuplicados(arregloOriginal);
        
        System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));
        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }
    
    public static int[] eliminarDuplicados(int[] arreglo) {
        List<Integer> listaUnicos = new ArrayList<>();
        for (int elemento : arreglo) {
            if (!listaUnicos.contains(elemento)) {
                listaUnicos.add(elemento);
            }
        }
        int[] resultado = new int[listaUnicos.size()];
        for (int i = 0; i < listaUnicos.size(); i++) {
            resultado[i] = listaUnicos.get(i);
        }
        
        return resultado;
    }
}
