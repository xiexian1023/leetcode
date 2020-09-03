package com.example.demo.leetCode.suanFa;



/**
 * @author xiexian
 * @version 1.0
 * @date 2020/9/2
 */
public class nine_palindromic_number {

    // 回文数

    public static void main(String[] args) {
        System.out.println(isPalindrome2(121));
    }

    /**
     * 输入: 121
     * 输出: true
     * <p>
     * 输入: -121
     * 输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * <p>
     * 输入: 10
     * 输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     */
    public static boolean isPalindrome2(int x) {
        int ans = 0;
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return x == ans || x == ans / 10;
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
