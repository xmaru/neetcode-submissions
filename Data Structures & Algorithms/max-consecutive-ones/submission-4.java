class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        int counter = 0;

        for (int num : nums) {
            if (num == 1) {
                counter++;
            }
            else {
                counter = 0;
            }
            maxC = Math.max(maxC, counter);
        }
        return maxC;
    }
}