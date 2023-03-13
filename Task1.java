package Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    // Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {

        int[] sourceArray = fillRandomArray();
        System.out.println("Исходный массив:");
        printArray(sourceArray);
        System.out.println("Отсортированный массив:");
        int[] sortedArray = mergeSorting(sourceArray, 0, sourceArray.length - 1);
        printArray(sortedArray);

    }

    public static int[] fillRandomArray() {
        System.out.print("Задайте размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int item :
                array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] mergeSorting(int[] array, int low, int high) {
        if (high <=low)
            return null;
        int mid = low + (high - low) / 2;
        mergeSorting(array, low, mid);
        mergeSorting(array, mid + 1, high);
        int[] temp = Arrays.copyOf(array, array.length);

        for (int k = low; k <= high; k++) {
            temp[k] = array[k];
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = temp[j];
                j++;
            } else if (j > high) {
                array[k] = temp[i];
                i++;
            } else if (temp[j] < temp[i]) {
                array[k] = temp[j];
                j++;
            } else {
                array[k] = temp[i];
                i++;
            }
        }
        return array;
    }

}
