public class ThreadImplementRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ThreadImplementRunnable t1=new ThreadImplementRunnable();
        Thread t2=new Thread(t1);
        t2.start();
    }
}
