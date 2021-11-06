package main.java;

public class MatrixPrinting {

    public static void main(String[] args) {

        // 2.Farklı Şekilde Matrisi Yazdırma
        char[][] matrix = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'K'},
                {'L', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S', 'T', 'U'},
                {'V', 'W', 'X', 'Y', 'Z'},
        };

        for (char[] row : matrix) {
            for (char value : row) {
                System.out.format("%c ", value);
            }
            System.out.println();
        }

        System.out.println("********************");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.format("%c ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
