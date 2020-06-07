
public class ThreadedWorkerWithSync extends Thread {

	private ResourcesExploiter rExp;

    ThreadedWorkerWithSync(ResourcesExploiter resource) {
        rExp = resource;
    }
    
    public void run()
    {
        synchronized(rExp){
            for(int i=0; i<1000; i++){
                rExp.exploit();
            }
        }
    }

    public ResourcesExploiter getrExp() {
        return rExp;
    }

    public void setrExp(ResourcesExploiter rExp) {
        this.rExp = rExp;
    } 
}
