package pcComponents;

public class MB implements PCInterface {
    int pcieCount;


    public MB(int pcieCount) {
        this.pcieCount = pcieCount;
    }

    @Override
    public void start(){
        System.out.println("MB starting...");
    }

    @Override
    public void stop() {
        System.out.println("MB stopping...");
        
    }

}
