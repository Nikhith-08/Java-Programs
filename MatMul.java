import java.util.Scanner;
class MatMul{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i,j,k;
        System.out.print("Enter the order of matrix: ");
        n=s.nextInt();
        int [][] a=new int[n][n];
        int [][] b=new int[n][n];
        System.out.println("Enter the elements of first matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        int [][] c=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    c[i][j]=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("\nMatrix Multiplication of \n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n and \n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                    System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n is \n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println();

    }
}