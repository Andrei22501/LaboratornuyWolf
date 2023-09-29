package org.example;

public abstract class Student {

    // Имя студента
    private String firstName;
    //Фамилия студента
    private String lastName;
    //Возраст студента
    private int age;

    public Student() {
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Метод который позволяет узнать имя студента
    public String getFirstName() {
        return firstName;
    }
    // Метод Set позволяет установить имя студента
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Вытащить фамилию студента
    public String getLastName() {
        return lastName;
    }
    // Метод Set позволяет установить фамилию студента
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // вытащить возраст студента
    public int getAge() {
        return age;
    }
    //установить возраст студента
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
