public class MinThreadPriorities extends Thread{
    public void run() {
        System.out.println("Priority of Thread is " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        MinThreadPriorities t1=new MinThreadPriorities();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }
}
