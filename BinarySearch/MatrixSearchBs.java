package BinarySearch;

public class MatrixSearchBs {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));  // Output: true
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null || matrix.length==0 || matrix[0].length==0) {
            return false;
    } 

     int rows = 0;
     int cols = matrix[0].length;

    //  for).
    int row = 0 , col = cols-1;

    while(row < col && col>=0) {
        
        if(matrix[row][col]==target) {
            return true;
        }
        else if(matrix[row][col] > target){
            col--;
        }
        else {
            row++;
        }
    }
    return false;
    }
    }
