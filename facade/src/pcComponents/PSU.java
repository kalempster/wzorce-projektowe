package pcComponents;

public class PSU implements PCInterface {
    int wats;


    public PSU(int wats) {
        this.wats = wats;
    }

    @Override
    public void start(){
        System.out.println("PSU starting...");
    }

    @Override
    public void stop() {
        System.out.println("PSU stopping...");
        
    }
}
