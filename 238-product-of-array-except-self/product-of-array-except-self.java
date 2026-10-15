class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix1 = new int[n];
        int[] prefix2 = new int[n];
        int[] answer = new int[n];

        prefix1[0] = 1;
        prefix2[n-1] = 1;
        for(int i = 1; i < n; i++){
            prefix1[i] = prefix1[i-1] * nums[i-1];
            prefix2[n - i - 1] = prefix2[n - i] * nums[n - i];
        }

        for(int i = 0; i < nums.length; i++){
            answer[i] = prefix1[i] * prefix2[i];
        }

        return answer;
    }
}