public class MaxThreadPriorities extends Thread{
    public void run() {
        System.out.println("Priority of Thread is " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        MaxThreadPriorities t1=new MaxThreadPriorities();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
