public class GPU extends PCDecorator{

    public GPU(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 359;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + " GPE: SilentiumPC Supremo L2 650W 80 Plus Gold " ;
    }
}
