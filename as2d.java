import java.util.*;

public class as2d {
    public static void queone(int matrix [][]){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                if (matrix[i][j]==7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void quetwo(int nums [][]){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if (i==1) {
                    sum+=nums[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void quethree(int matrix [][], int row, int col){
        int trans [][] =new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trans[j][i]=matrix[i][j];
            }
        }
    }
    public static void main(String args[]){
        // int matrix[][]= {{4,7,8},
        //                 {8,8,7}};
        //                 queone(matrix);
        // int nums[][]= {{1,4,9},
        // {11,4,3},
        // {2,2,3}};
        // quetwo(nums);
        int matrix [][]={{1,2,3},{4,5,6}};
        int row =matrix.length;
        int col =matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        quethree(matrix, row, col);
    }    
}
