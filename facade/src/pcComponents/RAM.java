package pcComponents;

public class RAM implements PCInterface {
    int gigaBytes;


    public RAM(int gigaBytes) {
        this.gigaBytes = gigaBytes;
    }


    @Override
    public void start(){
        System.out.println("RAM starting...");
    }

    @Override
    public void stop() {
        System.out.println("RAM stopping...");
        
    }

}
