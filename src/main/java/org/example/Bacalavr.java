package org.example;

public class Bacalavr extends Student {
    public boolean formatTraining;

    public Bacalavr() {
    }

    public Bacalavr(boolean formatTraining) {
        this.formatTraining = formatTraining;
    }

    public Bacalavr(String firstName, String lastName, int age, boolean formatTraining) {
        super(firstName, lastName, age);
        this.formatTraining = formatTraining;
    }

    public boolean isFormatTraining() {
        return formatTraining;
    }

    public void setFormatTraining(boolean formatTraining) {
        this.formatTraining = formatTraining;
    }

    @Override
    public String toString() {
        return "Bacalavr" +
                "\n Имя студента: " + getFirstName() +
                "\n Возраст студента: " + getAge() +
                "\n Формат обучения: " + (isFormatTraining() ? "очный" : "заочный");
    }

}
