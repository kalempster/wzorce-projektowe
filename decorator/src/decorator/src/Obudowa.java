public class Obudowa extends PCDecorator{

    public Obudowa(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 359;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + " Obudowa: SilentiumPC Signum SG1X EVO TG ARGB ";
    }
}
