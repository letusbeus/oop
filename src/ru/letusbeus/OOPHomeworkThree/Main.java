package ru.letusbeus.OOPHomeworkThree;

import static ru.letusbeus.OOPHomeworkThree.TaskOne.printSortedArray;
import static ru.letusbeus.OOPHomeworkThree.TaskOne.sortGivenArray;

public class Main {

    public static void main(String[] args) {
        System.out.println("TaskOne");
        printSortedArray(sortGivenArray(new int[]{51, 62, 43, 34, 26, 15}));
        // or you could create an array in advance:
        int[] givenArray = new int[]{10, 92, 38, 74, 56};
        printSortedArray(sortGivenArray(givenArray));
        System.out.println("TaskTwo");
        TaskTwo nums = new TaskTwo();
        nums.addMyNum(2);
        nums.addMyNum(6);
        nums.addMyNum(9);
        nums.addMyNum(0);
        TaskTwo.printNums(nums);
        System.out.println("Using \"getMyNum\"");
        System.out.println(nums.getMyNum(2));
        System.out.println(nums.getMyNum(0));
    }
}
