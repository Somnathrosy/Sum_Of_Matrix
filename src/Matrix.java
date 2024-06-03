import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1st Matrix
        System.out.println("Enter the No.of Row in Matrix1");
        int row1 = sc.nextInt();
        System.out.println("Enter the No.of column in Matrix1");
        int col1 = sc.nextInt();
        int [][]Matrix1 = new int[row1][col1];

        //Assign the values for Matrix 1
        for (int i = 0; i<row1;i++){
            for (int j=0; j<col1;j++){
                System.out.println("Enter the value of ["+i+"] and ["+j+"]");
                Matrix1[i][j]= sc.nextInt();
            }
        }

        //Printing Value of matrix 1
        System.out.println("The Matrix1 is");
        for (int i=0;i< Matrix1.length;i++){
            for (int j=0;j<Matrix1[i].length;j++){
                System.out.print(Matrix1[i][j]+" ");
            }
            System.out.println();
        }

        //2nd Matrix
        System.out.println("Enter the No.of Row in Matrix2");
        int row2 = sc.nextInt();
        System.out.println("Enter the No.of Column in Matrix2");
        int col2 = sc.nextInt();
        int [][]Matrix2 = new int[row2][col2];

        //Assign the values for Matrix 2
        for (int i = 0; i<row2;i++){
            for (int j=0; j<Matrix2[i].length;j++){
                System.out.println("Enter the value of ["+i+"] and ["+j+"]");
                Matrix2[i][j]= sc.nextInt();
            }
        }

        //Printing Value of matrix 2
        System.out.println("The Matrix2 is");
        for (int i=0;i< Matrix2.length;i++){
            for (int j=0;j<Matrix2[i].length;j++){
                System.out.print(Matrix2[i][j]+" ");
            }
            System.out.println();
        }

        //Sum of 2 Matrix
        int [][] Ans = new int[row1][col2];
        for (int i=0;i<row1;i++){
            for (int j=0;j<Ans[i].length;j++){
                Ans [i][j] = Matrix1[i][j]+Matrix2[i][j];
            }
        }
        //Showing Final Addition Matrix
        System.out.println("The Sum of Two matrix is:");
        for (int i=0;i< Ans.length;i++){
            for (int j=0;j<Ans[i].length;j++){
                System.out.print(Ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
