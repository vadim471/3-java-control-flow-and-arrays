package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {

        boolean b = canGetDriverLicense(10);
        System.out.println(b);

    }

    static boolean canGetDriverLicense(int age) {
        return age >= 18? true:false;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}
