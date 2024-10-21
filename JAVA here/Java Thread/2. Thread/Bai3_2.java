class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running.");
    }
}

public class Bai3_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();  // Bắt đầu thread
    }
}
