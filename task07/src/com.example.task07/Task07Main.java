package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 0;
        System.out.println(sum(myArray));

    }

    static int sum(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int summ = 0;
        for (int i = 0; i < arr.length; i++){
            summ += arr[i];
        }
        return summ;
    }

}