public class PCDecorator extends PC{
    protected PC _pc;

    public PCDecorator(PC pc){
        _pc = pc;
    }
    @Override
    public double Koszt() {
        return _pc.Koszt();
    }

    @Override
    public String Nazwa() {
        return _pc.Nazwa();
    }
}
