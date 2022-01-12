package fundamentals;


public class Multithread implements Runnable {

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world from " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Multithread t = new Multithread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();
        print();
    }

    @Override
    public void run() {
        print();
    }
}
