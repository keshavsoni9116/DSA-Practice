class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int num: set1){
            if(set2.contains(num)){
                temp.add(num);
            }
        }
        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}