package Basic9Streams;

public class Person {

    private String name;
    private String surName;
    private String placeOfBirth;
    private int age;
    private long phone;

    public Person(String name, String surName, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surName = surName;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
