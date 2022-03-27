package pcComponents;

public class Processor implements PCInterface {
    int cores;
    float frequency;

    public Processor(int cores, float frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    @Override
    public void start(){
        System.out.println("CPU starting...");
    }

    @Override
    public void stop() {
        System.out.println("CPU stopping...");
        
    }
    
}
