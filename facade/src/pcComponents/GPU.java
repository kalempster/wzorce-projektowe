package pcComponents;

public class GPU implements PCInterface {
    int ventilatorCount;
    

    public GPU(int ventilatorCount) {
        this.ventilatorCount = ventilatorCount;
    }
    @Override
    public void start(){
        System.out.println("GPU starting...");
    }

    @Override
    public void stop() {
        System.out.println("GPU stopping...");
        
    }

}
