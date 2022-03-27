public class Main {
    public static void main(String[] args) throws Exception {
        PC pc = new PC();
        pc.start();
        System.out.println("\n\nPC running\n\n");
        Thread.sleep(4000);
        pc.stop();


    }
}
