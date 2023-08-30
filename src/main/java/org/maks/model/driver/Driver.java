package org.maks.model.driver;

public class Driver {
    private String name;
    private int experience;         //опыт водителя

    public Driver() {
        this.name = "Ivan";
        this.experience = 2;
    }

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
