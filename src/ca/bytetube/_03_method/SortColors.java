package ca.bytetube._03_method;

import java.util.Random;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 * @author dal
 */
public class SortColors {

    public void sortColors(int[] nums) {
        partition(nums, 1);
    }


    public void partition(int[] nums, int pivot) {
        int less = -1;
        int more = nums.length;
        int cur = 0;
        while (cur < more) {
            if (nums[cur] < pivot) swap(nums, ++less, cur++);
            else if (nums[cur] > pivot) swap(nums, --more, cur);
            else cur++;

        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] getRandArray(int range, int length) {
        if (length < 0) length = 10;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int randNum = random.nextInt(range);//[0,100)
            array[i] = randNum;
        }

        return array;

    }


}
