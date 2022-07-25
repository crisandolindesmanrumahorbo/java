public class MultithreadMain {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Multithread tMultithread = new Multithread(i);
            Thread thread = new Thread(tMultithread);
            thread.start();
        }
    }
}