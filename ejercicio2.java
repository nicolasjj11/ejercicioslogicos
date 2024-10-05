public class ejercicio2 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        // Matriz resultado
        int[][] resultado = new int[A.length][B[0].length];

        // Multiplicamos las  matrices
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir el resultado
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}

