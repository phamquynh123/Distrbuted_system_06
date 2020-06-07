import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String args[])
    {
        ResourcesExploiter resource = new ResourcesExploiter(0);
//        ResourcesExploiterWithLock resource = new ResourcesExploiterWithLock(0);
//        ThreadedWorkerWithSync worker1 = new ThreadedWorkerWithSync(resource);
//        ThreadedWorkerWithSync worker2 = new ThreadedWorkerWithSync(resource);
//        ThreadedWorkerWithSync worker3 = new ThreadedWorkerWithSync(resource);
        ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource);
        ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource);
        ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource);
//        ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resource);
//        ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resource);
//        ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resource);
        worker1.start();	
        try {
            worker1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        worker2.start();
        try {
            worker2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        worker3.start();
        try {
            worker3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("rsc = " + resource.getRsc());
    }
}
