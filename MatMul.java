import java.util.Scanner;
class MatMul{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m1,m2,n1,n2,i,j,k;
        System.out.print("Enter the number of rows for first matrix: ");
        m1=s.nextInt();
        System.out.print("Enter the number of cloumns for first matrix: ");
        n1=s.nextInt();
        System.out.print("Enter the number of rows for second matrix: ");
        m2=s.nextInt();
        System.out.print("Enter the number of columns for second matrix: ");
        n2=s.nextInt();
        if (n1==m2){
            int [][] a=new int[m1][n1];
            int [][] b=new int[m2][n2];
            System.out.println("Enter the elements of first matrix: ");
            for(i=0;i<m1;i++){
                for(j=0;j<n1;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the elements of second matrix: ");
            for(i=0;i<m2;i++){
                for(j=0;j<n2;j++){
                    b[i][j]=s.nextInt();
                }
            }
            int [][] c=new int[m1][n2];
            for(i=0;i<m1;i++){
                for(j=0;j<n1;j++){
                    for(k=0;k<m1;k++){
                        c[i][j]=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("\nMatrix Multiplication of \n");
            for(i=0;i<m1;i++){
                for(j=0;j<n1;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.print("\n");
            }
            System.out.println("\n * \n");
            for(i=0;i<m2;i++){
                for(j=0;j<n2;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.print("\n");
            }
            System.out.println("\n = \n");
            for(i=0;i<m1;i++){
                for(j=0;j<n1;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.print("\n");
            }
            System.out.println();
        }
        else {
            System.out.println("The matrices cannot be multiplied.");
        }
    }
}