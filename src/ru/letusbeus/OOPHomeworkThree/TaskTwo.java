package ru.letusbeus.OOPHomeworkThree;

import java.util.*;

/*
Создайте класс, который представляет из себя коллекцию, добавьте 2 метода add и get для работы с коллекцией.
Реализуйте возможность использования цикла for-each для работы с данной коллекцией.
Для этого реализуйте интерфейс Iterable и создайте итератор
 */

public class TaskTwo implements Iterable<Integer> {
    List<Integer> nums;

    public TaskTwo() {
        this.nums = new ArrayList<>();
    }

    public void addMyNum(int num) {
        nums.add(num);
    }

    public int getMyNum(int num) {
        while (nums.iterator().hasNext()) {
            return nums.get(num);
        }
        return -1;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < nums.size();
        }

        @Override
        public Integer next() {
            return nums.get(index++);
        }
    }

    public static void printNums(TaskTwo nums) {
        System.out.println(nums.nums);
    }
}