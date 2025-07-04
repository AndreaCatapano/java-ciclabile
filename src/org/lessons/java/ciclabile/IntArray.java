package org.lessons.java.ciclabile;

public class IntArray {

    private int[] intArray;
    private int indexArray;

    IntArray(int[] intArray) {
        this.indexArray = 0;
        this.intArray = intArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public int getIndexArray() {
        return indexArray;
    }

    public void setIndexArray(int indexArray) {
        this.indexArray = indexArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int getNextNumber() {
        if (indexArray == 0) {
            return intArray[indexArray];
        }
        indexArray++;
        return intArray[indexArray];
    }
}
