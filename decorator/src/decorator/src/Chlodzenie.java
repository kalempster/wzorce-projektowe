public class Chlodzenie extends PCDecorator{

    public Chlodzenie(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 329;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + "Chlodzenie: Cooler Master MasterLiquid ML240L V2 RGB 2x120mm" ;
    }
}
