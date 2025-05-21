public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aereo aereo = new Aereo("Boeing", "747", 2020, 4, "Cargo");
        aereo.muovi();
        aereo.ferma();

    }
}
