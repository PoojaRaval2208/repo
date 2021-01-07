import java.util.*;
public class MatrixDemo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	    
        System.out.println("Enter The Number Of Matrix Rows");
         
        int matrixRow = scan.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
         
        int matrixCol = scan.nextInt();
        
        System.out.println("Enter The Number Of Sub-Matrix Rows");
        
        int matrixRow1 = scan1.nextInt();
        
        System.out.println("Enter The Number Of Sub-Matrix Columns");
        
        int matrixCol1 = scan1.nextInt();
         
        //defining 2D array to hold matrix data
        int[][] matrix = new int[matrixRow][matrixCol];
        // Enter Matrix Data
        enterMatrixData(scan, matrix, matrixRow, matrixCol);
        
      //defining 2D array to hold matrix data
        int[][] matrix1 = new int[matrixRow1][matrixCol1];
        // Enter Matrix Data
        enterMatrixData1(scan1, matrix1, matrixRow1, matrixCol1);
        
        // Print Matrix Data
        printMatrix(matrix, matrixRow, matrixCol);
        
        // Print Matrix Data
        printMatrix1(matrix1, matrixRow1, matrixCol1);
        
        int m = matrix.length; 
        int n = matrix1.length; 
      
        if (isSubset(matrix,matrix1, m, n)) 
            System.out.print("arr2[] is "
                             + "subset of arr1[] "); 
        else
            System.out.print("arr2[] is "
                             + "not a subset of arr1[]");
	}
        
  public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol){
     System.out.println("Enter Matrix Data");
          
          for (int i = 0; i < matrixRow; i++)
          {
              for (int j = 0; j < matrixCol; j++)
              {
                  matrix[i][j] = scan.nextInt();
              }
          }
  }
  
  public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
    System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
        
  }
  public static void enterMatrixData1(Scanner scan1, int[][] matrix1, int matrixRow1, int matrixCol1){
     System.out.println("Enter Matrix Data");
          
          for (int i = 0; i < matrixRow1; i++)
          {
              for (int j = 0; j < matrixCol1; j++)
              {
                  matrix1[i][j] = scan1.nextInt();
              }
          }
  }

  public static void printMatrix1(int[][] matrix1, int matrixRow1, int matrixCol1){
    System.out.println("Your Sub-Matrix is : ");
        
        for (int i = 0; i < matrixRow1; i++)
        {
            for (int j = 0; j < matrixCol1; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }

  }
static boolean isSubset(int[][] matrix,int [][] matrix1,int m, int n) {
	  int i = 0;
	  int j = 0;
	  for( i = 0;i < n; i++) {
		  for(j = 0;j < m; j++) {
			  if(matrix1[i][j] == matrix[i][j]) {
				  break;
			  }
		  }
	  }
		if(j == m) {
			  return false;
		  }
		return true;
	  }
}