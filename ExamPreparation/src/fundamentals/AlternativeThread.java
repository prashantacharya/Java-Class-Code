package fundamentals;

public class AlternativeThread {
    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread("T1") {
            @Override
            public void run() {
                print();
            }
        };

        Thread t2 = new Thread("T2") {
            @Override
            public void run() {
                print();
            }
        };

        t1.start();
        t2.start();
        print();
    }
}
