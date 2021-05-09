import java.util.concurrent.*;
/**
 *
 * @author mbilo
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        int numWorkers = 6;
        int threadPoolSize = 3;
    
        ExecutorService tpes =
            Executors.newFixedThreadPool(threadPoolSize);
    
        WorkerThread[] workers = new WorkerThread[numWorkers];
        for (int i = 0; i < numWorkers; i++) {
            workers[i] = new WorkerThread(i);
            tpes.execute(workers[i]);
        }
        tpes.shutdown();
    }
}