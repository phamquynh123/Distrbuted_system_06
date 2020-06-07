
public class ThreadedWorkerWithLock extends Thread {
	private ResourcesExploiterWithLock rExp;

    ThreadedWorkerWithLock(ResourcesExploiterWithLock resource) {
        rExp = resource;
    }

    public ResourcesExploiter getrExp() {
        return rExp;
    }

    public void setrExp(ResourcesExploiterWithLock rExp) {
        this.rExp = rExp;
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            rExp.exploit();
        }
    }
}
