package Basic5Inheritance;

public class MobileDeveloper extends Developer {

    private String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    void makeCode() {
        System.out.printf("%s is codding for %s for %f PLN in %s\n", name, company, salary, mobileOs);

    }
}
