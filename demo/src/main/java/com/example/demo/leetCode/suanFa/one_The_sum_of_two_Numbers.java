package com.example.demo.leetCode.suanFa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author xiexian
 * @version 1.0
 * @date 2020/9/2
 */
public class one_The_sum_of_two_Numbers {
    // 两数之和

    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] print = twoSum2(nums, target);
        System.out.println(Arrays.toString(print));

    }

    // O(n)
    static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    // O(n^2)
    static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexs[0] = i;
                    indexs[1] = j;
                    return indexs;
                }
            }
        }
        return null;
    }
}
