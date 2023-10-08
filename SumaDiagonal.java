public class SumaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        if (esMatrizCuadrada(matriz)) {
            int sumaDiagonal = calcularSumaDiagonal(matriz);
            System.out.println("La suma de los elementos en la diagonal es: " + sumaDiagonal);
        } else {
            System.out.println("La matriz no es cuadrada, no se puede calcular la suma de la diagonal.");
        }
    }
    public static boolean esMatrizCuadrada(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        return filas == columnas;
    }
    public static int calcularSumaDiagonal(int[][] matriz) {
        int suma = 0;
        int longitud = matriz.length;
        for (int i = 0; i < longitud; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
}
