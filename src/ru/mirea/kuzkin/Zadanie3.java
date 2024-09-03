package ru.mirea.kuzkin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // Создаем массив.
        int[] array1, array2;

        Random random = new Random();
        // Реализуем ввод с клавиатуры.
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        // Переменная, в которой храниться размер.
        int len_array;
        len_array = scan.nextInt();
        // Записываем в массив рандомные числа.
        array1 = new int[len_array];

        for (int i = 0; i < len_array; i++) {
            array1[i] = random.nextInt(-100, 100);
        }
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        // Записываем в массив рандомные числа.
        array2 = new int[len_array];

        for (int i = 0; i < len_array; i++) {
            array2[i] = random.nextInt(-100, 100);
        }
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i<array1.length; i++)
        {
            for (int j = 0; j<array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    System.out.print(array1[i]);
                    break;
                }
            }
        }
    }
}
