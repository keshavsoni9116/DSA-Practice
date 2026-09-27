class Solution {
    public void rotate(int[] nums, int k) {
        // TC is n square.
        // for(int i = 0; i < k; i++){
        //     for(int j = nums.length-1; j > 0; j--){
        //         int temp = nums[j];
        //         nums[j] = nums[j-1];
        //         nums[j-1] = temp;
        //     }
        // }

        // int p2 = nums.length - 1;
        // int p1 = p2 - k;
        // while(p2 >= 0){
        //     if(p1 < 0){
        //         p1 = 0;
        //     }
        //     int temp = nums[p2];
        //     nums[p2] = nums[p1];
        //     nums[p1] = temp;
        //     p1--;
        //     p2--;
        // }

        k %= nums.length;
        for(int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        for(int i = 0; i < k/2; i++){
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }

        for(int i = k; i < (k + nums.length)/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i + k];
            nums[nums.length - 1 - i + k] = temp;
        }
    }
}