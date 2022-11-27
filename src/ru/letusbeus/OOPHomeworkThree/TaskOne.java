package ru.letusbeus.OOPHomeworkThree;

import java.util.Arrays;
import java.util.Comparator;

/*
Создать метод, который принимает массив int и сортирует его по последней цифре.
Используйте метод Arrays.sort. для его работы создайте свой компаратор.
Имеется в виду последняя цифра в записи числа, например в числе 123, последння цифра 3.
Надо сделать сортировку, которая учитывает только эту последнюю цифру в числе.
 */

public class TaskOne {
    public static Integer[] sortGivenArray(int[] givenArray) {
        Integer[] result = new Integer[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            result[i] = givenArray[i] % 10;
        }
        Arrays.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < result.length; i++) {
            for (int k : givenArray) {
                if (result[i] == k % 10) {
                    result[i] = k;
                }
            }
        }
        return result;
    }

    public static void printSortedArray(Integer[] givenArray){
        System.out.println(Arrays.toString(givenArray));
    }
}
