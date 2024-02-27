import java.util.Scanner;
class MatrixAddition{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m,n,i,j;
        System.out.print("Enter the number of rows for matrix: ");
        m=s.nextInt();
        System.out.print("Enter the number of cloumns for matrix: ");
        n=s.nextInt();
        int [][] a=new int[m][n];
        int [][] b=new int[m][n];
        System.out.println("Enter the elements of first matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of first matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        int [][] c=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("\nMatrix addition of \n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n + \n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n = \n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}