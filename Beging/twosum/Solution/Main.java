package Beging.twosum.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Resolution rs = new Resolution();
        // int[] numbers = { 3, 2, 4 };
        int[] numbers = { 2, 7, 11, 15 };
        int[] positions = rs.twoSum(numbers,9);
        System.out.println(Arrays.toString(positions));
    }
}
