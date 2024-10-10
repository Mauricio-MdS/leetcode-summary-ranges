import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int start = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i -1] + 1) {
                if (start == i -1) {
                    ranges.add(String.valueOf(nums[start]));
                } else {
                    ranges.add("%d->%d".formatted(nums[start], nums[i-1]));
                }
                start = i;
            }
        }

        return ranges;
    }
}