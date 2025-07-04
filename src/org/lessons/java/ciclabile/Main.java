package org.lessons.java.ciclabile;

public class Main {

    public static void main(String[] args) {

        int[] array1 = { 2, 4, 6, 8, 10 };
        int[] array2 = { 1, 3, 5, 7, 9 };

        IntArray intArray1 = new IntArray(array1);
        IntArray intArray2 = new IntArray(array2);

        System.out.println(intArray1.getNextNumber());
        System.out.println(intArray2.getNextNumber());
        System.out.println(intArray1.getNextNumber());
        System.out.println(intArray2.getNextNumber());
        System.out.println(intArray1.getNextNumber());
        System.out.println(intArray2.getNextNumber());
    }
}
