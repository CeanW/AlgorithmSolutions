package com.ceanw;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. Summary Ranges
 * https://leetcode.com/problems/summary-ranges/description/
 *
 * 使用2个int记录range的始末两端，每次遍历时更新end或者start
 * 注意：数组末值的处理
 *
 * Test cases: 28
 * Runtime: 0 ms
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Created by CeanW 5/25/2018
 */

public class Summary_Ranges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (end == nums[i] - 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    list.add(String.valueOf(end));
                } else {
                    list.add(start + "->" + end);
                }
                start = nums[i];
                end = nums[i];
            }
        }

        if (start == end) {
            list.add(String.valueOf(end));
        } else {
            list.add(start + "->" + end);
        }
        return list;
    }
}
