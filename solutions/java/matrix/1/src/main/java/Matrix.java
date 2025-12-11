import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {

    private int[][] matrix;
    Matrix(String matrixAsString) {
        String[] intermedio = matrixAsString.split("\n");
        int[][] matris = new int[intermedio.length][];
        for (int i=0;i<intermedio.length;i++){
            String s = intermedio[i];
            matris[i] = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        matrix = matris;
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] result = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            result[i] = matrix[i][columnNumber-1];
        }
        return result;
    }
}
