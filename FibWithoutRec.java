import java.util.*;
class FibWithoutRec{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t1=0,t2=1,t3,n;
        System.out.print("Enter the number of elements in Fibonacci series: ");
        n=s.nextInt();
        System.out.println("The Fibonacci series is: ");
        for(int i=0;i<n;i++){
            System.out.print(t1+" ");
            t3=t2+t1;
            t1=t2;
            t2=t3;
        }
        System.gc();
    }
}