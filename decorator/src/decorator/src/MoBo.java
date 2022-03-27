public class MoBo extends PCDecorator{

    public MoBo(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 850;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + " MoBo: Gigabyte Z690 UD DDR5 ";
    }
}
