package org.example;

public class Magistr extends Student {

    private boolean lifeInHostel;

    public Magistr() {
    }

    public Magistr(boolean lifeInHostel) {
        this.lifeInHostel = lifeInHostel;
    }

    public Magistr(String firstName, String lastName, int age, boolean lifeInHostel) {
        super(firstName, lastName, age);
        this.lifeInHostel = lifeInHostel;
    }

    public boolean isLifeInHostel() {
        return lifeInHostel;
    }

    public void setLifeInHostel(boolean lifeInHostel) {
        this.lifeInHostel = lifeInHostel;
    }

    @Override
    public String toString() {
        return "Magistr : " +
                "\n Имя студента: " + getFirstName() +
                "\n Возраст студента: " + getAge() +
                "\n Проживает в общажитии: " + (isLifeInHostel() ? "да" : "нет");
    }
}

