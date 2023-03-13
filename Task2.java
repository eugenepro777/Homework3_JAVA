package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    /*   Пусть дан произвольный список целых чисел,
     удалить из него чётные числа*/
    public static void main(String[] args) {
        List<Integer> sourceArray = fillRandomList();
        System.out.println("Исходный список:");
        printArray(sourceArray);
        System.out.println("Список без четных чисел:");
        printArray(removeEvenNumbers(sourceArray));

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

    public static List<Integer> removeEvenNumbers(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }
}
