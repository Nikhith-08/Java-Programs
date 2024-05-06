public class SimpleThreadExtend extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        SimpleThreadExtend t1 = new SimpleThreadExtend();
        t1.start();
    }
}
