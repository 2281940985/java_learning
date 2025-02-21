import java.util.ArrayList;
import java.util.List;

class Solution {
    public int trap(int[] height) {
        int[] preMax = new int[height.length];
        int[] surMax = new int[height.length];
        preMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            preMax[i] = Math.max(height[i], preMax[i-1]);
        }
        surMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            surMax[i] = Math.max(surMax[i+1], height[i]);
        }
        int res = 0;
        for(int i = 0; i < height.length; i++) {
            res += Math.min(surMax[i], preMax[i]) - height[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
