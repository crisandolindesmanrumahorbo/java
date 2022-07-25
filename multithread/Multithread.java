public class Multithread implements Runnable {

    private final int threadNumber;

    public Multithread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (this.threadNumber == 2) {
                throw new RuntimeException();
            }
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}