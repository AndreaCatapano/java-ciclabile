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
        if (hasNextNumber()) {
            int number = intArray[indexArray];
            indexArray++;
            return number;
        }
        System.out.println("Non ci sono ulteriori elementi!");
        return -1;
    }

    public boolean hasNextNumber() {
        return indexArray < this.intArray.length;
    }
}
