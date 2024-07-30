package Fuctions;

public class TwoDimensionalArray {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,1,2},
            {4,5,2,3},
            {7,8,0,4},
            {7,8,0,4},
           
        };
        
        int[] result = calculate(matrix);
        System.out.println(result);
        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] calculate(int[][] matrix) {
        int sumMainDiagonal = 0;
        int rowsWithRepeatedElements = 0;
        int columnsWithRepeatedElements = 0;
        
        int n = matrix.length;
        
    
        for (int i = 0; i < n; i++) {
            sumMainDiagonal = sumMainDiagonal + matrix[i][i];
        }
        
        
        for (int i = 0; i < n; i++) {
            boolean repeated = false;
            
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] == matrix[i][k]) {
                        repeated = true;
                        break;
                    }
                }
                if (repeated)
                	break;
            }
            
            if (repeated) rowsWithRepeatedElements++;
        }
        
        for (int j = 0; j < n; j++) {
            boolean repeated = false;
            
            for (int i = 0; i < n - 1; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (matrix[i][j] == matrix[k][j]) {
                        repeated = true;
                        break;
                    }
                }
                if (repeated)
                	break;
            }
            
            if (repeated) columnsWithRepeatedElements++;
        }
        
        return new int[]{sumMainDiagonal, rowsWithRepeatedElements, columnsWithRepeatedElements};
    }
}
