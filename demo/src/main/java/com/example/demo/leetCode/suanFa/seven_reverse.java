package com.example.demo.leetCode.suanFa;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author xiexian
 * @version 1.0
 * @date 2020/9/2
 */
public class seven_reverse {
    // 整数反转

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 输入: 123
     * 输出: 321
     * 输入: -123
     * 输出: -321
     * 输入: 120
     * 输出: 21
     */
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
