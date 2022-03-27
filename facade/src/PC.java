
import pcComponents.GPU;
import pcComponents.MB;
import pcComponents.PCInterface;
import pcComponents.PSU;
import pcComponents.Processor;
import pcComponents.RAM;

public class PC implements PCInterface {
    GPU gpu = new GPU(2);
    MB mb = new MB(2);
    Processor cpu = new Processor(4, 2.5f);
    PSU psu = new PSU(600);
    RAM ram = new RAM(16);

    @Override
    public void start() {
        psu.start();
        mb.start();
        cpu.start();
        ram.start();
        gpu.start();
    }

    @Override
    public void stop() {
        psu.stop();
        mb.stop();
        cpu.stop();
        ram.stop();
        gpu.stop();
    }

}
