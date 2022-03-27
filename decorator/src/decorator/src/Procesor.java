public class Procesor extends PCDecorator{

    public Procesor(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 915;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + "CPU: Intel Core i5-12400F";
    }
}
