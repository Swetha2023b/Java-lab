import java.util.Scanner;
 
class MatrixMultiplication
{
   public static void main(String args[])
   {
      int row, col, row1, col1, sum = 0, i, j, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("\nEnter the  number of rows of  the first matrix  : ");
      row = in.nextInt();
	  System.out.println("Enter the number of columns of the first matrix : ");
      col = in.nextInt();
 
      int first[][] = new int[row][col];
 
      System.out.println("\nEnter the elements of first matrix");
 
      for (i = 0; i < row; i++)
         for (j = 0; j < col; j++)
            first[i][j] = in.nextInt();
 
      System.out.println("\nEnter the number  of rows of  the second matrix  : ");
      row1 = in.nextInt();
	  System.out.println("Enter the number of columns of the second matrix : ");
      col1 = in.nextInt();
 
      if (col!= row1)
         System.out.println("The matrices cannot be multiplied with each other!!!");
      else
      {
         int second[][] = new int[row1][col1];
         int multiply[][] = new int[row][col1];
 
         System.out.println("\nEnter the elements of second matrix");
 
         for (i = 0; i < row1; i++)
            for (j = 0; j < col1; j++)
               second[i][j] = in.nextInt();
 
         for (i = 0; i < row; i++)
         {
            for (j = 0; j < col1; j++)
            {  
               for (k = 0; k < row1; k++)
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("\nThe Product of the two matrices is :");
 
         for (i = 0; i < row; i++)
         {
            for (j= 0; j < col1; j++)
               System.out.print(multiply[i][j]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}