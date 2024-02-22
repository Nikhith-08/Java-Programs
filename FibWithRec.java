import java.util.*;
class FibUsingRec {
    static int t1=0,t2=1,t3;
    void fib(int n){
        if(n>0){
            System.out.print(t1+" ");
            t3=t2+t1;
            t1=t2;
            t2=t3;
            fib(n-1);
        }
    }
}
class FibWithRec{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        FibUsingRec f = new FibUsingRec();
        System.out.print("Enter number of elements in Fibonacci series: ");
        int n=s.nextInt();
        System.out.print("Elements in Fibonacci series: ");
        f.fib(n);
        System.gc();
    }
}