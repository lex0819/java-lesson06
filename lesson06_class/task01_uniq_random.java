package lesson06_class;

import java.util.*;

public class task01_uniq_random {

    /*Create array of 1000 items, random , range 0-24*/
    public static int[] initArray(int range, int len){
        int[] numbers = new int[len];

        Random ran = new Random();

        for (int i = 0; i < len; i++) {
            numbers[i] =  ran.nextInt(range + 1);
        }
        return numbers;
    }

    /*Проверка массива случайных чисел на процент уникальности
    * HashSet содержит только уникальные числа в сгенерированном массиве.
    * Формула для вычисления процента уникальности:
    * количество уникальных чисел * 100 / разделить на общее число чисел в массиве
    */
    public static double getPercentUniqueValues(int[] numbers){

        List<Integer> list_numbers = new ArrayList<>();
        for (int number : numbers)
            list_numbers.add(number);

        Set<Integer> uniq_numbers = new HashSet<>(list_numbers);

        return (double) uniq_numbers.size() * 100 / numbers.length;
    }

    public static void main(String[] args){

        System.out.println(getPercentUniqueValues(initArray(24, 1000)));

    }
}
