public class Deadlock {

    public static void main(String args[]) throws InterruptedException {

        Thread threadA = new Thread(() -> {
            System.out.println("Running...");
        });
        Thread threadB = new Thread(() -> {
            System.out.println("Stopped...");
        });
        threadA.start();
        threadB.start();
    }
}

