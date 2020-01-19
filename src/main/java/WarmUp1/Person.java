package WarmUp1;

import java.time.LocalDate;

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


    @Override
    public String toString() {
        return name + " " + surName + " (ur. " + (LocalDate.now().getYear() - age) + " r.)" + "\n" +
                "m. ur.: " + placeOfBirth + "\n" +
                "tel: " + phone + "\n";
    }






}
