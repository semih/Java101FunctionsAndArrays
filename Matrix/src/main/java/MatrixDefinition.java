package main.java;

public class MatrixDefinition {

    public static void main(String[] args) {

        // 1. Matris Tanımı
        int[][] matrix = new int[2][3];
        matrix[0][1] = 5;
        matrix[1][2] = 7;

        // 2. Değer atamasıyla Matris tanımlama
        int[][] preDefinedMatrix = {{4, 1}, {2, 0, 5}};

        // 3. Yalnızca ilk boyut(en soldaki) için bellek büyüklüğü vererek Matris tanımlama
        int[][] twoD = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];

        // Matrisi yazdırma
        for (int row = 0; row < twoD.length; row++) {
            for (int col = 0; col < twoD[row].length; col++) {
                System.out.format("%c ", twoD[row][col]);
            }
            System.out.println();
        }
    }
}
