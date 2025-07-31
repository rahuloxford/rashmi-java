package com.rashmi.static_keyword;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Chris", 26, 6.2, 86.35);
        Human human2 = new Human("John", 18, 5.11, 76.94);
        Human human3 = new Human("Merry", 16, 5.6, 64.25);

        System.out.println(human1.name);
        System.out.println(human1.age);

        System.out.println(human2.name);
        System.out.println(human2.age);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
