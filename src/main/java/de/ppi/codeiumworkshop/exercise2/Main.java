package de.ppi.codeiumworkshop.exercise2;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Before sorting
        System.out.println("Array before sorting:");
        sorter.p(array);

        // Sorting the array
        sorter.b(array);

        // After sorting
        System.out.println("Array after sorting:");
        sorter.p(array);
    }
}
