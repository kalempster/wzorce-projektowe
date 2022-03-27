public class Main {
    public static void main(String[] args) {
        PC nowypc = new Obudowa(new Chlodzenie(new GPU(new RAM(new MoBo(new Procesor(new Grafika(new SSD())))))));
        System.out.println(nowypc.Nazwa());
        System.out.println(nowypc.Koszt());

    }

}
