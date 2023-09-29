package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Magistr[] firstGroup = createMagistrStudents();
        Bacalavr[] secondGroup = createBacalvrStudents();
        int i = 0;
        for (Bacalavr student : secondGroup) {
            if (student.isFormatTraining()) {
                i++;
            }
        }
        System.out.println("Количество студентов на очном обучении = " + i);
        for (Magistr magistr : firstGroup) {
            if (magistr.isLifeInHostel()) {
                System.out.println(magistr);
            }
        }
    }

    static Bacalavr[] createBacalvrStudents() {
        Bacalavr[] bacalavrs = new Bacalavr[15];
        String[] names = {"Мастурбек", "Снежана", "Владимир", "Геогрий", "Злат", "Андрей", "Урзул", "Майнфест", "Сонар", "Малик", "Иван", "Меркель", "Абурхан", "Святослав", "Герасим"};
        int min = 17;
        int max = 51;
        Random random = new Random();
        for (int i = 0; i < bacalavrs.length; i++) {
            Bacalavr bacalavr = new Bacalavr();
            int randomAges = random.nextInt(max) + min;
            bacalavr.setFirstName(names[i]);
            bacalavr.setAge(randomAges);
            bacalavr.setFormatTraining(i % 3 == 0);
            bacalavrs[i] = bacalavr;
        }
        return bacalavrs;
    }

    static Magistr[] createMagistrStudents() {
        Magistr[] magistrs = new Magistr[10];
        String[] names = {"Завана", "Semen", "Ебрагим", "Тарара", "Алтуша", "Женя", "Зулуба", "Альбина", "Жанна", "Елизовета"};
        int min = 19;
        int max = 55;
        Random random = new Random();
        for (int i = 0; i < magistrs.length; i++) {
            Magistr magistr = new Magistr();
            int randomAges = random.nextInt(max) + min;
            magistr.setFirstName(names[i]);
            magistr.setAge(randomAges);
            magistr.setLifeInHostel(i % 3 == 0);
            magistrs[i] = magistr;

        }
        return magistrs;

    }

}