import java.util.Random;

class ArrayThird {
    public void FirstTask(){
        int[][] matrix = {
                {1, 5, 10, 3},
                {2, 6, 8, 12},
                {7, 3, 9, 4}
        };

        int Z = 5;

        int columns = matrix[0].length;

        for (int col = 0; col < columns; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] > Z) {
                    count++;
                }
            }
            System.out.println("Number of elements in column " + col + " exceeding " + Z + ": " + count);
        }
        PrintLine();
    }
    public void SecondTask(){
        int N = 5;
        int size = 3;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int[][] matrix = generateRandomMatrix(size);
            printMatrix(matrix);

            int sum = sumBelowMainDiagonal(matrix);
            System.out.println("Sum of elements below the main diagonal: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum of elements below the main diagonal among all matrices: " + maxSum);
    }
    public int[][] generateRandomMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(20) - 10;
            }
        }
        return matrix;
    }
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    public int sumBelowMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public void PrintLine(){
        System.out.println();
        for(int i = 0; i<45; i++){
            System.out.print('-');
        }
        System.out.println();
    }
}
