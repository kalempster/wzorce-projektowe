public class Grafika extends PCDecorator{

    public Grafika(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 2300;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + " GPU: GTX1080 ";
    }
}
