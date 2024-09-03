package ru.mirea.kuzkin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1_2 {
    public static void main(String[] args) {
        // Создаем массив.
        int[] array;
        // Реализуем ввод с клавиатуры.
        System.out.println("Введите размер массива");

        Scanner scan = new Scanner(System.in);
        // Переменная, в которой храниться размер.
        int len_array;
        len_array = scan.nextInt();
        //System.out.println(len_array);
        // Записываем в массив рандомные числа.
        array = new int[len_array];

        Random random = new Random();

        for (int i = 0; i < len_array; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int maxcount = 0;

        for (int i = 0; i<10;i++)
        {
            // Число для поиска.
            int numToFind;
            System.out.println("Число для поиска");

            numToFind = array[random.nextInt(array.length)];
            int count = myMethod(array, numToFind);
            if (maxcount < count)
            {
                maxcount = count;
            }
        }
        System.out.println(maxcount);
    }
    public static int myMethod(int[] array, int numToFind)
    {
        // Бинарный поиск.
        int count = 0;
        int low = 0;
        int high = array.length;
        int middle;

        while (low <= high)
        {
            middle = (low + high) / 2;
            int num = array[middle];

            if (num == numToFind) {
                System.out.println("Значение найдено под индексом " + middle);
                return count;
            } else if (num > numToFind) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            System.out.println("Итерация под номером " + count);
            count++;
        }
        System.out.println("Искомого значения в массиве нет");
        return count;
    }
}
