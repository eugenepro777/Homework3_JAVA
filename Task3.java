package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    /* Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее из этого списка.*/
    public static void main(String[] args) {
        List<Integer> sourceArray = fillRandomList();
        System.out.println("Исходный список:");
        printArray(sourceArray);
        getValuesMinMaxAverage(sourceArray);

    }
    public static List<Integer> fillRandomList() {
        System.out.print("Задайте размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add((int) (Math.random() * 30));
        return list;
    }

    public static void printArray(List<Integer> list) {
        for (int item :
                list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int MinMaxAverageValue(ArrayList<Integer> list) {
        int maxItem = list.get(0);
        for (int item :
                list) {
            if (item > maxItem) maxItem = item;
        }
        return maxItem;
    }

    public static void getValuesMinMaxAverage(List<Integer> list) {
        int minValue = Collections.min(list);
        int maxValue = Collections.max(list);
        int size = list.size();
        int amount = 0;
        for (Integer item :
                list) {
            amount += item;
        }
        var averageValue = (double) amount / size;
        System.out.printf("Мин. значение = %d;\nМакс. значение = %d;\nСреднее арифметическое = %.2f", minValue, maxValue, averageValue);

    }
}
