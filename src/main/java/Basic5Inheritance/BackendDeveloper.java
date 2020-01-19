package Basic5Inheritance;

public class BackendDeveloper extends Developer {

    private String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    void makeCode() {
        System.out.printf("%s is codding for %s for %f PLN in %s\n", name, company, salary, backendLanguage);
    }
}
