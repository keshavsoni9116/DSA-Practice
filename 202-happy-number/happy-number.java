class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sos = n;
        while(sos != 1){
            int temp = 0;
            while(sos != 0){
                temp += Math.pow(sos % 10, 2);
                sos /= 10;
            }
            sos = temp;
            if(set.contains(temp)){
                return false;
            } else{
                set.add(temp);
            }
        }
        return true;
    }
}