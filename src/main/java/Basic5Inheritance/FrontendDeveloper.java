package Basic5Inheritance;

public class FrontendDeveloper extends Developer {

    private String javaScriptFramework;

    public FrontendDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    void makeCode() {
        System.out.printf("%s is codding for %s for %f PLN in %s\n", name, company, salary, javaScriptFramework);

    }
}
