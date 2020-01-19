package Basic5Inheritance;

public class Main {
    public static void main(String[] args) {

        Developer piotr = new BackendDeveloper("Piotr", "Ericsson", 0.5, "Java");
        Developer adam = new FrontendDeveloper("Adam", "SDA", 999.99, "Angular");
        Developer ania = new MobileDeveloper("Ania", "Google", 100000.0, "Android");

        piotr.makeCode();
        adam.makeCode();
        ania.makeCode();

    }
}
