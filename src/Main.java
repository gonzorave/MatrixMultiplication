import java.util.Random;

public class Main {

    public static int numGen(int num) {
        Random random = new Random();
        int ranGen = 1 + random.nextInt(num);
        return ranGen;
    }

    public static void matrixGen(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void matrixPrint(int[][] matrix, String str) {
        System.out.println(str);
        matrixPrint(matrix);
    }

    public static void matrixPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiply(int[][] mtrxFirst, int[][] mtrxSecond) {

        int rowOne = mtrxFirst.length;
        int colOne = mtrxFirst[0].length;
        int rowTwo = mtrxSecond.length;
        int colTwo = mtrxSecond[0].length;

        int[][] result = new int[rowOne][colTwo];

        if (colOne != rowTwo) throw new IllegalArgumentException("Illegal matrix dimensions.");

        for (int i = 0; i < rowOne; i++)
            for (int j = 0; j < colTwo; j++)
                for (int k = 0; k < colOne; k++) {
                    result[i][j] += mtrxFirst[i][k] * mtrxSecond[k][j];
                }

        return result;
    }

    public static void main(String[] args) {
        int row = numGen(5);
        int[][] first = new int[numGen(5)][row];
        int[][] second = new int[row][numGen(5)];

        matrixGen(first);
        matrixGen(second);

        matrixPrint(first, "FIRST MATRIX");
        matrixPrint(second, "SECOND MATRIX");
        matrixPrint(multiply(first, second), "PRETTY WONDERFUL HANDSOME RESULT");
    }


}






