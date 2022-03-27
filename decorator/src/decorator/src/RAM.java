public class RAM extends PCDecorator{

    public RAM(PC pc) {
        super(pc);
    }
    @Override
    public double Koszt(){
        return super.Koszt() + 820;
    }

    @Override
    public String Nazwa() {
        return super.Nazwa() + "RAM: Kingston FURY 1x16GB 5200MHz CL40";
    }
}
